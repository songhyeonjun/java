package com.hi.mvcProject;

import java.util.HashMap;

public class CastingTest {

	public static void main(String[] args) {
		
		// 기본형 형 변환
		int a = 127; // 4바이트(큰)
		byte b = (byte)a; // 1바이트(작은)
		
		byte c = 127;
		int d = c;
		
		double a2 = 100.001;
		float b2 = (float)a2;
		
		// 참조형 형 변환
		// 자바스크립트에서 json과 같은 역할, 키:값 저장구조
		// map(맵)구조, HashMap
		HashMap map = new HashMap();
		map.put("name", "홍길동"); // Object자리
		map.put("age", 100); // 자동형변환
		
		String name = (String)map.get("name"); //Object
		int age = (int)map.get("age");
		//int<--(오토박싱/언박싱)--Interger<--(강제형변환)--Object
		
		// 참조형 형 변환은 상속관계에 있을 때만 가능
		// String -- Integer (형제관계에서는 형 변환 사용불가)
		// int<--->Integer, float<--->Float 자동변화
	}

}
