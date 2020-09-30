package com.hseea.wasteManagement.entity;

import java.util.Arrays;
import java.util.List;

public class QuestionSort {
	
	private static List<String> sortList = Arrays.asList("访问时间","门店基本信息","有设施设备","有宣传告知","有回收服务","有长效管理","有分类实效");
	
	private static QuestionSort instance = null;
	private QuestionSort() {}
	
	public static QuestionSort getIntancce() {
		if(instance == null)
			instance = new QuestionSort();
		return instance;
	}
	public String getSortName(int index) {
		return sortList.get(index);
	}
	public int getSortIndex(String name) {
		return sortList.indexOf(name);
	}
}
