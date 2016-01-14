package com.weixin.course.message.req;

/**
 * 消息基类（普通用户 -> 公众帐号）
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:41:50 一句话概括该类的功能
 */
public class BaseMessage {
	private String ToUserName;// 开发者微信号
	private String FromUserName;// 发送方帐号（一个OpenID）
	private long CreateTime;// 消息创建时间 （整型）
	private String MsgType;//text/image/voice
	private long MsgId;// 消息id，64位整型

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

	public long getMsgId() {
		return MsgId;
	}

	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
}
