package org.example.user.controller;

import org.example.user.entity.User;
import org.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	private UserService service;

	public UserService getService() {
		return service;
	}

	@Autowired
	public UserController setService(UserService service) {
		this.service = service;
		return this;
	}
	
	@RequestMapping("/login")
	public String retrieveLoginPage() {
		return "user-login";
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("message", String.format("An user of id [%d] has been successfully created.", service.create(user)));
		return "user-login";
	}
	
	@RequestMapping("/users")
	public String displayAllUsers(ModelMap model) {
		model.addAttribute("users", service.findAll());
		return "all-users";
	}

	@RequestMapping("/users/id/validation")
	@ResponseBody
	public String validateId(@RequestParam("id") int id) {
		
		final String idTakenMessage = String.format("Id is already taken: [%d]", id);
		return service.find(id).isPresent() ? idTakenMessage : "";
	}
}
