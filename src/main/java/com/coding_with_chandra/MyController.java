package com.coding_with_chandra;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@GetMapping("/load")
	public ModelAndView loadJsp() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		return mv;
	}
	
	@PostMapping("/sendDataFromJC")
	public ModelAndView sendDataFromJC(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		System.out.println(request.getParameter("empName"));
		System.out.println(request.getParameter("mobile"));
		return mv;
	}
	
	

}
