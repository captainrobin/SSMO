package com.ssmo.controller.homepage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/homepage")
public class Homepage {
	
	@RequestMapping("/toHomepage.html")
	public String toHomepage(HttpServletRequest request){
		
		
		
		System.out.println("toHomepage!!!!!!!!");
		return "homepage";
	}

}
