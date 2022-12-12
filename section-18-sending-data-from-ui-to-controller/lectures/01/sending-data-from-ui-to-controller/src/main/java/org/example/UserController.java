package org.example;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// using form
	@RequestMapping("/login")
	public ModelAndView retrieveLoginPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-login");
		return modelAndView;
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user-login-complete");
		return modelAndView;
	}
	
	// using query parameters
	@RequestMapping("/path-login")
	public ModelAndView display(
			@RequestParam(defaultValue = "0") int id,
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "") String email
	) {
		User user = new User()
				.setId(id)
				.setName(name)
				.setEmail(email);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-login-complete");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
