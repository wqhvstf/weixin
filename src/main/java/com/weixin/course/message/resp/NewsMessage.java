package com.weixin.course.message.resp;

import java.util.List;

/**
 * 回复图文消息
 * 
 * @author qinghua.wu
 * @date 2016年1月14日-下午5:01:58 一句话概括该类的功能
 */
public class NewsMessage extends BaseMessage {
	private int ArticleCount;// 是 图文消息个数，限制为10条以内
	private List<Article> Articles;// 是
									// 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Article> getArticles() {
		return Articles;
	}

	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
}
