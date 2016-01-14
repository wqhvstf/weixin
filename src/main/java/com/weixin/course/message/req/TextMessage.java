package com.weixin.course.message.req;

/**
 * 文本消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:44:14 一句话概括该类的功能
 */
public class TextMessage extends BaseMessage {
	// 消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
