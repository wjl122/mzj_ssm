package com.mzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mzj.model.NewdsModel;

public interface NewdsDao {

	/**
	 * 
	 * @param offset 起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<NewdsModel> queryAll(@Param("offset" )int offset,@Param("limit") int limit);
}
