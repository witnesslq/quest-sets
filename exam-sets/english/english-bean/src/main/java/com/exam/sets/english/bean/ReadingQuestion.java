package com.exam.sets.english.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

/**
 * 阅读选择题
 * @author wangyang
 * 2015-02-01
 */
@Entity
public class ReadingQuestion {

    /**
     * 唯一主键
     */
    private String id;

    /**
     * 题号
     */
    private int questionIndex;

    /**
     * 题干
     */
    private String questionStem;

    /**
     * 选项
     */
    private Set<Option> chooseItems;

    /**
     * 正确答案
     */
    private String correctAnswer;

    /**
     * 误导答案
     */
    private String confuseAnswer;

    /**
     * 分析
     */
    private String analysis;

    /**
     * 知识点
     */
    private Set<KnowlegePoint> knowlegePoints;

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

	public int getQuestionIndex() {
		return questionIndex;
	}

	public void setQuestionIndex(int questionIndex) {
		this.questionIndex = questionIndex;
	}

	public String getQuestionStem() {
		return questionStem;
	}

	public void setQuestionStem(String questionStem) {
		this.questionStem = questionStem;
	}

	@OneToMany
	public Set<Option> getChooseItems() {
		return chooseItems;
	}

	public void setChooseItems(Set<Option> chooseItems) {
		this.chooseItems = chooseItems;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getConfuseAnswer() {
		return confuseAnswer;
	}

	public void setConfuseAnswer(String confuseAnswer) {
		this.confuseAnswer = confuseAnswer;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public Set<KnowlegePoint> getKnowlegePoints() {
		return knowlegePoints;
	}

	public void setKnowlegePoints(Set<KnowlegePoint> knowlegePoints) {
		this.knowlegePoints = knowlegePoints;
	}

}