package second_project;

import java.util.Scanner;

/**
 * @author hi
 *
 * Scanner
 * 3���� ���ڸ� �Է� �� ���� ū ���ڸ�
 * ã���ÿ�.
 */
public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��1:");
		int value1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("��2:");
		int value2 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("��3:");
		int value3 = Integer.parseInt(scanner.nextLine());
		
		if(value1 > value2) {
			if(value1 > value3) {
				System.out.println(value1);
			}else{
				System.out.println(value3);
			}
		} else {//value2�� ��ŭ
			if(value2 > value3) {
				System.out.println(value2);
			} else {
				System.out.println(value3);
			}
		}
		scanner.close();
	}
}