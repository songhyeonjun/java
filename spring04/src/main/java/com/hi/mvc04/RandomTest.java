package com.hi.mvc04;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			//System.out.println(r.nextBoolean());
			//System.out.println(r.nextInt());
			
			//1~10
			//System.out.println(r.nextInt(10) + 1);
			
			// 10 ~ 90
			System.out.println(r.nextInt(81) + 10);
		}
		
	
	}

}
