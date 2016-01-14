package com.weixin.course.message.resp;

/**
 * 消息基类（公众帐号 -> 普通用户）
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:54:40 一句话概括该类的功能
 */
public class BaseMessage {
	private String ToUserName;// 接收方帐号（收到的OpenID）
	private String FromUserName;// 开发者微信号
	private long CreateTime;// 消息创建时间 （整型）
	private String MsgType;// text

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
