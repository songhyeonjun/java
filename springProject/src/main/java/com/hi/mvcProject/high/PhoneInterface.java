package com.hi.mvcProject.high;

public interface PhoneInterface {

	// 일반변수는 안되고, 상수만 허용!
	// 특저안 값을 클래스내에서 공유할 목적으로 상수만 허용
	// int x;
	final String con = "전화기협회";	// 기능만 정의
	// public abstract로 정의
	// 추상메서드(분완전한 메서드)
	
	public abstract void call();
	void internet();
	void text();
}
