package pack03;

import java.util.Scanner;

public class ex1 {

	
	/*
	 * 두 수를 입력받아
	 * 동일하면 동일
	 * 아니면 달라요 출력
	 * 
	 * id가 root라고 입력하면 맞다
	 * id가 root가 아닌 다른 것으로 입력하면 틀려요 출력
	 */
	public static void main(String[] args) {

		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 : ");
		x = scanner.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		y = scanner.nextInt();
		
		if(x == y) {
			System.out.println("동일해요!");
		}
		else {
			System.out.println("달라요!");
		}
		scanner.close();
	}
	
}
