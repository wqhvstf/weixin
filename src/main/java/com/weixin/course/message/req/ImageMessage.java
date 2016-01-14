package com.weixin.course.message.req;

/**
 * 图片消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:45:24 一句话概括该类的功能
 */
public class ImageMessage extends BaseMessage {
	private String PicUrl;// 图片链接

	private long MediaId;// 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public long getMediaId() {
		return MediaId;
	}

	public void setMediaId(long mediaId) {
		MediaId = mediaId;
	}

}
