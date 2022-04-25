package com.hi.mvcProject.car;

public class CarClass implements CarInterface {

	String color;
	String size;
	
	@Override
	public void start() {
		System.out.println("달린다");
	}

	@Override
	public void stop() {
		System.out.println("멈춘다");
	}

}
