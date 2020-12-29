package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.entity.Goods;
import com.offcn.service.GoodsService;

@Controller
public class GoodsController {
	
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("/getGoods")
	@ResponseBody
	public List<Goods> getGoods(){
		
		return service.getGoods();
		
	}

}
