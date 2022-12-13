package org.example;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// using form
	@RequestMapping("/login")
	public String retrieveLoginPage() {
		return "user-login";
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("user", user);
		return "user-login-complete";
	}
	
	// using query parameters
	@RequestMapping("/path-login")
	public String display(
			@RequestParam(defaultValue = "0") int id,
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String email,
			ModelMap model
	) {
		model.addAttribute("user",
				new User()
				.setId(id)
				.setName(name)
				.setEmail(email)
		);

		return "user-login-complete";
	}
}
