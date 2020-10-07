package com.hseea.wasteManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class AccountManagement {

	@RequestMapping(method = RequestMethod.POST)
	public String login() {
		
		return "";
	}
}
