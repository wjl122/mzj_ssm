package com.mzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mzj.model.ShowIndexesModel;

public interface ShowIndexesDao {

	/**
	 * 
	 * @param offset
	 *            查询起始位置
	 * @param limit
	 *            查询条数
	 * @return
	 */
	List<ShowIndexesModel> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 
	 * @param type 根据类型查找
	 * @return
	 */
	List<ShowIndexesModel> queryAllByType(String type);
	
}
