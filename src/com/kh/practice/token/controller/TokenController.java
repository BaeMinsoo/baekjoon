package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		String result = null;
		StringTokenizer st = new StringTokenizer(str);
		result = st.nextToken();
		return result;
	}
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String result = null;
		
		return result;
	}
	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int result = 0;
		// getLength?
		return result;
	}
}
