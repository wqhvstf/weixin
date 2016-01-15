package com.weixin.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weixin.dao.ResultPOMapper;
import com.weixin.po.ResultPO;

@RestController
@RequestMapping(value = "/qhb")
public class QHBController {

	@Autowired
	private ResultPOMapper resultPOMapper;

	@RequestMapping(value = "/getHbList", method = { RequestMethod.POST }, produces = { "application/json" })
	public List<ResultPO> getHbList(@RequestBody Map<String, String> params) {
		String openId = params.get("openid");
		List<ResultPO> resultPOs = resultPOMapper.selectResultByOpenid(openId);
		return resultPOs;
	}

}
