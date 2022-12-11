package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {
	
	@RequestMapping("/dealObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		modelAndView.addObject("employee", new Employee().setId(10).setName("Mirio").setSalary(1000000));
		return modelAndView;
	}

}
