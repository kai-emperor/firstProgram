package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.offcn.entity.User;

@Mapper
public interface UserDao {
	
	@Select("select * from user")
	 List<User> getAll();

}
