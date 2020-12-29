package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.entity.Slevel;
import com.offcn.service.SlevelService;

@Controller
@RequestMapping("api/gmall/sl")
public class SlevelController {
	
	@Autowired
	private SlevelService service;
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Slevel> getAll(Integer fid){
		
		
		return service.getAll(fid);
	}

}
