package com.dlm.fmp.util;

import com.github.houbb.opencc4j.util.ZhConverterUtil;

public class ZHConverterExample {
	public static void main(String[] args) {
		String original = "生命不息，奮鬥不止";
		String original1 = "生命不息，奋斗不止";
		String GENERATIONWORD_HU = "淸";
		String result = ZhConverterUtil.convertToSimple(GENERATIONWORD_HU);
		System.out.println(result);
		String result1 = ZhConverterUtil.convertToTraditional(GENERATIONWORD_HU);
		System.out.println(result1);
	}
}
