package com.exam.sets.english.bean;

/**
 * 翻译参考答案
 * @author wangyang
 * 2015-02-01
 */
public class TranslateReferAnswer {

    /**
     * 翻译参考答案
     */
    public TranslateReferAnswer() {
    }

    /**
     * 唯一主键
     */
    private String id;

    /**
     * 参考答案内容
     */
    private String article;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TranslateReferAnswer [id=");
		builder.append(id);
		builder.append(", article=");
		builder.append(article);
		builder.append("]");
		return builder.toString();
	}

}