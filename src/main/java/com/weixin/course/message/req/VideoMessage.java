package com.weixin.course.message.req;

/**
 * 视频消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:48:58 一句话概括该类的功能
 */
public class VideoMessage extends BaseMessage {
	private long MediaId;// 视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
	private long ThumbMediaId;// 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

	public long getMediaId() {
		return MediaId;
	}

	public void setMediaId(long mediaId) {
		MediaId = mediaId;
	}

	public long getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(long thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
