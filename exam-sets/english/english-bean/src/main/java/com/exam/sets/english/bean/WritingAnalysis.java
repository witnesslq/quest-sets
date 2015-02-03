package com.exam.sets.english.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * 写作解析
 * @author wangyang
 * 2015-02-01
 */
@Entity
public class WritingAnalysis {
	
    /**
     * 唯一主键
     */
    private String id;

    /**
     * 解析
     */
    private String analysis;

    /**
     * 参考答案
     */
    private String referenceAnswer;

	@Id
	@GenericGenerator(name="hibernateUuid", strategy="uuid")
	@GeneratedValue(generator="hibernateUuid")
	@Column(nullable=false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public String getReferenceAnswer() {
		return referenceAnswer;
	}

	public void setReferenceAnswer(String referenceAnswer) {
		this.referenceAnswer = referenceAnswer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WritingAnalysis [id=");
		builder.append(id);
		builder.append(", analysis=");
		builder.append(analysis);
		builder.append(", referenceAnswer=");
		builder.append(referenceAnswer);
		builder.append("]");
		return builder.toString();
	}

}