package pack03;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		String id;
		String pw;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		id = scanner.next();
		System.out.print("PW 입력 : ");
		pw = scanner.next();
		
		if(id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		scanner.close();
	}
}
