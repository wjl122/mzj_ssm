package com.mzj.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mzj.dao.FriendLinksDao;
import com.mzj.model.FriendLinksModel;
import com.mzj.service.FriendLinkService;

@Service
public class FriendLinkServiceImpl implements FriendLinkService {

	private Logger Logger = LoggerFactory.getLogger(this.getClass());
	// 注入service依赖
	@Autowired
	private FriendLinksDao friendLinksDao;

	@Override
	public List<FriendLinksModel> getList() {

		return friendLinksDao.queryAll(0, 1000);
	}

	// @Transactional
	/**
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
}
