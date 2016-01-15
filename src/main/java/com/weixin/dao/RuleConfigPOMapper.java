package com.weixin.dao;

import com.weixin.po.RuleConfigPO;

public interface RuleConfigPOMapper {
    int deleteByPrimaryKey(String sguid);

    int insert(RuleConfigPO record);

    int insertSelective(RuleConfigPO record);

    RuleConfigPO selectByPrimaryKey(String sguid);

    int updateByPrimaryKeySelective(RuleConfigPO record);

    int updateByPrimaryKey(RuleConfigPO record);
}