package com.hi.mvcProject.car;


public class CarMain {

	public static void main(String[] args) {

		CarClass car = new CarClass();
		car.color = "흰색";
		car.size = "중형";
		
		car.start();
		
		
		HyundaiAvante a = new HyundaiAvante();
		a.drive();
		
		HyundaiSonata s = new HyundaiSonata();
		s.drive();
	}

}
