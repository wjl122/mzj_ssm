package com.mzj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mzj.model.FriendLinksModel;


public interface FriendLinksDao {

	/**
	 * 查询所有友情链接
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<FriendLinksModel> queryAll(@Param("offset") int offset, @Param("limit") int limit);
 
}
