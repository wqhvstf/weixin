package com.weixin.dao;

import java.util.List;

import com.weixin.po.ResultPO;

public interface ResultPOMapper {
	int insert(ResultPO record);

	int insertSelective(ResultPO record);

	List<ResultPO> selectResultByOpenid(String openid);
}