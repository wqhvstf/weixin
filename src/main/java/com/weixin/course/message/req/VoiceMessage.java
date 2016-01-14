package com.weixin.course.message.req;

/**
 * 语音消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午4:47:13 一句话概括该类的功能
 */
public class VoiceMessage extends BaseMessage {
	private long MediaId;// 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。

	private String Format;// 语音格式，如amr，speex等

	public long getMediaId() {
		return MediaId;
	}

	public void setMediaId(long mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}
}
