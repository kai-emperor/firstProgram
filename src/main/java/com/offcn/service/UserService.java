package com.offcn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public List<User> getAll(){
		
		List<User> users=dao.getAll();
		return users;
		
	}

}
