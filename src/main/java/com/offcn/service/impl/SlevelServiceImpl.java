package com.offcn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.SlevelDao;
import com.offcn.entity.Slevel;
import com.offcn.service.SlevelService;

@Service
public class SlevelServiceImpl implements SlevelService{

	@Autowired
	private SlevelDao dao;
	
	
	@Override
	public List<Slevel> getAll(Integer fid) {
		return dao.getAll(fid);
	}

}
