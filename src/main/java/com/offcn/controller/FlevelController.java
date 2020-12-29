package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offcn.entity.Flevel;
import com.offcn.service.FlevelService;

@RestController
@RequestMapping("api/gmall/fl")
public class FlevelController {
	
	
	
	@Autowired
	private FlevelService service;
	
	@RequestMapping("/getall")
	public List<Flevel> getAll(){
		
		return service.getAll();
	}
	
	
	

}