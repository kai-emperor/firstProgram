package com.offcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.GoodsDao;
import com.offcn.entity.Goods;
import com.offcn.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsDao dao;
	
	
	
	
	public List<Goods> getGoods() {
		
		
		return dao.getGoods();
	}

}
