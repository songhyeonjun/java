package second_project;

import java.util.Scanner;

/**
 * @author hi
 *
 * Scanner
 * 3개의 숫자를 입력 받 가장 큰 숫자를
 * 찾으시오.
 */
public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값1:");
		int value1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("값2:");
		int value2 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("값3:");
		int value3 = Integer.parseInt(scanner.nextLine());
		
		if(value1 > value2) {
			if(value1 > value3) {
				System.out.println(value1);
			}else{
				System.out.println(value3);
			}
		} else {//value2가 더큼
			if(value2 > value3) {
				System.out.println(value2);
			} else {
				System.out.println(value3);
			}
		}
		scanner.close();
	}
}