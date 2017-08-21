package com.mzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mzj.model.PicturesModel;

public interface PicturesDao {
    
	/**
	 * 
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return
	 */
	 List<PicturesModel> queryAll(@Param("offset") int offset,@Param("limit") int limit);
	 
	 
	 List<PicturesModel> queryAllByType(String type);
	 
}
