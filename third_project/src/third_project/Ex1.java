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
			System.out.println("1.����|2.���|3.�ܰ�|4.���¹�ȣ|5.����");
			System.out.println("--------------------------");
			System.out.print("����>");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.print("���ݾ�>");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("��ݾ�>");
					balance -= scanner.nextInt();
					break;
				case 3:
					System.out.print("�ܰ�>");
					System.out.println(account+":"+balance);
					break;
				case 4:
					System.out.print("("+account+")���¹�ȣ>");
					scanner.nextLine();
					account = scanner.nextLine();
					break;
				case 5:
					run = false;
					break;
			}
		}
		System.out.println("����");
	}
}