package com.howtodoinjava.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.model.studenttwo;

@Controller
@RequestMapping("/studenttwo")
public class studentcontrollertwo {

	@RequestMapping(value = "/getAllStudentstwo", method = RequestMethod.GET)
	public ModelAndView getAll()
	{
		//System.out.println(propertyFileConfiguration.getTestProperty());
		  return new ModelAndView("studentregtwo", "studenttwo", new studenttwo());
		
		//return "studentreg";
	}
	
	@RequestMapping(value = "/addStudenttwo", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("studenttwo")studenttwo studenttwo, 
	   ModelMap model) {
	      model.addAttribute("name1", studenttwo.getName());
	      model.addAttribute("age1", studenttwo.getAge());
	      model.addAttribute("id", studenttwo.getId());
	      
	      
	      return "studentresultstwo";
	   }
}
