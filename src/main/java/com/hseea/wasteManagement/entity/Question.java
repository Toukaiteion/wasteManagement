package com.hseea.wasteManagement.entity;

import java.util.List;

public class Question {

	private int questionId;
	private String questionTitle;
	//题型：选择、填空。。。。。。
	private String questionType;
	//问题分类的类型，比如数学问题、英语问题、物理问题
	private String questionSort;
	private boolean isNecessity;
	private List<String> options;
	private String remarks;
	private String answer;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public boolean isNecessity() {
		return isNecessity;
	}
	public void setNecessity(boolean isNecessity) {
		this.isNecessity = isNecessity;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuestionSort() {
		return questionSort;
	}
	public void setQuestionSort(String questionSort) {
		this.questionSort = questionSort;
	}
	
}
