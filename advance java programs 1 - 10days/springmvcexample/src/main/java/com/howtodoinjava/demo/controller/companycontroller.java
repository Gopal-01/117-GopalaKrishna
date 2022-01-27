package com.howtodoinjava.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.model.Student;


@Controller
@RequestMapping("/company")
public class companycontroller {

	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("student")Student student, 
	   ModelMap model) {
	      model.addAttribute("name1", student.getName());
	      model.addAttribute("age1", student.getAge());
	      model.addAttribute("id", student.getId());
	      
	      
	      return "studentresults";
	   }
}
