package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.offcn.entity.Goods;

@Mapper
public interface GoodsDao {
	
	@Select("select * from goods")
	List<Goods> getGoods();
	
	//Goods getGoodsById(Integer id);

}
