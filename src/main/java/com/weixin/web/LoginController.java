package com.weixin.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.weixin.util.JsonUtil;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	private static final String AppID = "wxe3dc8107a9355d3e";
	private static final String AppSecret = "d4624c36b6795d1d99dcf0547af5443d";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/authenticate")
	public ModelAndView authenticate(HttpServletRequest request) throws Exception {
		// 获取code
		String code = request.getParameter("code");
		ModelAndView modelAndView = null;
		// 获取openid 和access_token
		if (code != null && code.length() != 0) {
			String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + AppID + "&secret=" + AppSecret
					+ "&code=" + code + "&grant_type=authorization_code";
			Map<String, String> tokenParams = (Map<String, String>) JsonUtil
					.jsonToMap(restTemplate.getForObject(url, String.class));
			System.out.println(tokenParams);
			String refresh_token = tokenParams.get("refresh_token");

			// 刷新token
			String urlRefreash = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + AppID
					+ "&grant_type=refresh_token&refresh_token=" + refresh_token;
			Map<String, String> tokenRefreashParams = (Map<String, String>) JsonUtil
					.jsonToMap(restTemplate.getForObject(urlRefreash, String.class));

			String access_token = tokenRefreashParams.get("access_token");
			String openid = tokenRefreashParams.get("openid");

			modelAndView = new ModelAndView("authenticate");
			modelAndView.addObject("openid", openid);
			modelAndView.addObject("access_token", access_token);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/getuserinfo")
	@ResponseBody
	public Map<String, String> getUserInfo(HttpServletRequest request) {
		String access_token = request.getParameter("access_token");
		String openid = request.getParameter("openid");
		// 获取用户信息
		String userUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token + "&openid=" + openid
				+ "&lang=zh_CN";
		Map<String, String> userInfo = (Map<String, String>) JsonUtil
				.jsonToMap(restTemplate.getForObject(userUrl, String.class));
		return userInfo;
	}

}
