package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.offcn.entity.Flevel;
@Mapper
public interface FlevelDao {
	
	@Select("select * from flevel ")
	List<Flevel> getAll();
	
	

}
