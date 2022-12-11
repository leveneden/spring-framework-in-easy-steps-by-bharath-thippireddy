package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView greet() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 2);
		modelAndView.addObject("name", "Logan");
		modelAndView.addObject("salary", 40000);
		return modelAndView;
	}
}