package pack03;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		String id;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("id 입력 : ");
		id = scanner.next();
		
		if(id == "root") {
			System.out.println("맞아요!");
		}
		else {
			System.out.println("달라요!");
		}
		scanner.close();
	}

}
