package second_project;

import java.util.Scanner;

/**
 * @author hi
 *
 * Scanner�� ����ؼ� ���̵� �н����带 �Է¹޾�
 * ���̵� : users
 * �н����尡 : 19876�϶� �α��� �����̶�� ����Ʈ
 * ���̵� Ʋ���� ��� : ���̵� �������� �ʽ��ϴ�.
 * �н����尡 Ʋ���� ��� : �α��� ���з� ���� �ܼ�â�� �α�
 * 
 * String equals
 * ���� ==
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
				System.out.println("�α��� �����߽��ϴ�.");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ���ϴ�.");
			}
		} else {
			System.out.println("�α��� ����:���̵� �������� �ʽ��ϴ�.");
		}
	}
}
