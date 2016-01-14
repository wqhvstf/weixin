package com.weixin.course.message.resp;

/**
 * 图片消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:57:20 一句话概括该类的功能
 */
public class ImageMessage extends BaseMessage {
	private long MediaId;// 通过素材管理接口上传多媒体文件，得到的id。

	public long getMediaId() {
		return MediaId;
	}

	public void setMediaId(long mediaId) {
		MediaId = mediaId;
	}
}
