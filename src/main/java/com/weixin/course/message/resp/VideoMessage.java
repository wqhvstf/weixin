package com.weixin.course.message.resp;

/**
 * 回复视频消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:59:16 一句话概括该类的功能
 */
public class VideoMessage extends BaseMessage {
	private long MediaId;// 是 通过素材管理接口上传多媒体文件，得到的id
	private String Title;// 否 视频消息的标题
	private String Description;// 否 视频消息的描述

	public long getMediaId() {
		return MediaId;
	}

	public void setMediaId(long mediaId) {
		MediaId = mediaId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
