package third_project;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		String account = "";
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.계좌번호|5.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.print("예금액>");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("출금액>");
					balance -= scanner.nextInt();
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(account+":"+balance);
					break;
				case 4:
					System.out.print("("+account+")계좌번호>");
					scanner.nextLine();
					account = scanner.nextLine();
					break;
				case 5:
					run = false;
					break;
			}
		}
		System.out.println("종료");
	}
}
