package com.hseea.wasteManagement.entity;

import java.util.Arrays;
import java.util.List;

public class QuestionType {
	private static List<String> type = Arrays.asList("单选","多选","填空","图片","录音","视频");;
	private static QuestionType instance;
	private QuestionType() {}
	public static QuestionType getInstance() {
		if(instance == null)
			instance = new QuestionType();
		return instance;
	}
	public static int getTypeIndex(String name) {
		return type.indexOf(name);
	}
	public static String getTypeName(int index) {
		return type.get(index);
	}
}
