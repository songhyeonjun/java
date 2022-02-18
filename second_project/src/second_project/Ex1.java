package second_project;

import java.util.Scanner;

/**
 * @author hi
 *
 * Scanner를 사용해서 아이디 패스워드를 입력받아
 * 아이디가 : users
 * 패스워드가 : 19876일때 로그인 성공이라고 프린트
 * 아이디가 틀렸을 경우 : 아이디가 존재하지 않습니다.
 * 패스워드가 틀렸을 경우 : 로그인 실패로 각각 콘솔창에 로깅
 * 
 * String equals
 * 숫자 ==
 */
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID:");
		String name = scanner.nextLine();
		
		System.out.print("PW:");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("users")) {
			if(password == 19876) {
				System.out.println("로그인 성공했습니다.");
			} else {
				System.out.println("로그인 실패:패스워드가 틀립니다.");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않습니다.");
		}
	}
}
