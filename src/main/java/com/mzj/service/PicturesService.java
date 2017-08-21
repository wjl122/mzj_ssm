package com.mzj.service;

import java.util.List;

import com.mzj.model.FriendLinksModel;
import com.mzj.model.PicturesModel;

import ch.qos.logback.core.subst.Token.Type;


/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface PicturesService {
	/**
	 * 查询所有友情链接
	 * 
	 * @return
	 */
	List<PicturesModel> getList();
	
	List<PicturesModel> getListByType(String type);
}
