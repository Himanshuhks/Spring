package com.webApp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	@RequestMapping("/cafe")
	public String WelcomePage(Model model) {
		String header = "MOM'S CAFE";
		model.addAttribute("headers", header);
		return "welcome-page";
	}
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request , Model model) {
		String value = request.getParameter("food");
		model.addAttribute("food", value);
		return "processOrder";
	}
}
