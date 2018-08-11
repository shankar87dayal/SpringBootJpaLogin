package com.example.demo.gradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.gradle.service.LoginService;

@Controller
public class LoginController {
	
	String siteName = "Mega Site";
	@Autowired
	LoginService service;
	
	/* Without Spring Security
	@RequestMapping("/getParamFromReq")
	@ResponseBody //--- To display returned string to browser
	public String showMessage(@RequestParam String name, ModelMap map) {//@RequestParam --To fetch parameter from request into variable name, ModelMap --- To send data as a model from controller to view(jsp/html)  
		map.put("namegetValue", name);
		return "login";
	}
	
	*/
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String password){
		boolean isValidUser = service.validateUser(username, password);
		
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("usernameValue", username);
		model.put("password", password);
		
		return "welcome";
	}
	
	
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model)
	{//With Spring Security
		return "welcome";
	}
	*/
	
	public String display() {
		return siteName;
	}
}
