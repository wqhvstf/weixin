package com.weixin.dao;

import com.weixin.po.UserPO;

public interface UserPOMapper {
	int deleteByPrimaryKey(String sguid);

	int insert(UserPO record);

	int insertSelective(UserPO record);

	UserPO selectByPrimaryKey(String sguid);

	int updateByPrimaryKeySelective(UserPO record);

	int updateByPrimaryKey(UserPO record);
}