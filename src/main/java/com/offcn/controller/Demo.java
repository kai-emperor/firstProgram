package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.entity.User;
import com.offcn.service.UserService;

@Controller
public class Demo {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/hello")
	public String HelloWorld(){
		
		
		return "index";
	}
	
	
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<User> getUsers(){
		
		
		return service.getAll();
	}
	
	

}
