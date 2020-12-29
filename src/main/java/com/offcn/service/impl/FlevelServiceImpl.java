package com.offcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.offcn.dao.FlevelDao;
import com.offcn.entity.Flevel;
import com.offcn.service.FlevelService;


@Service
public class FlevelServiceImpl implements FlevelService {
	
	@Autowired
	private FlevelDao dao;
	
	
	@Override
	public List<Flevel> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
