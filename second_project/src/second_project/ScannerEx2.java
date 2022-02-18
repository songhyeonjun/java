package second_project;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData1;
		String inputData2;
		
		inputData1 = scanner.nextLine();
		inputData2 = scanner.nextLine();
		
		System.out.println("µ¡¼À:"+
		(Integer.parseInt(inputData1)+
		Integer.parseInt(inputData2)));
	}

}
