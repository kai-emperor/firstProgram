package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.offcn.entity.Slevel;

@Mapper
public interface SlevelDao {
	
	@Select("select * from slevel where flid= #{fid}")
	List<Slevel> getAll(Integer fid);

}
