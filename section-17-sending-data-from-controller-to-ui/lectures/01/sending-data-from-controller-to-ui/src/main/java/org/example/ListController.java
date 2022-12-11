package org.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {
	
	@RequestMapping("/dealList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee().setId(1).setName("Sarah").setSalary(132000));
		employees.add(new Employee().setId(2).setName("Noelia").setSalary(145000));
		employees.add(new Employee().setId(3).setName("Steve").setSalary(92000));
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
