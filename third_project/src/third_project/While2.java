package third_project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class While2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int sum = 0;
			int init = scanner.nextInt();
			int i = init;
			int end = scanner.nextInt();
			
			while(i<=end) {
				sum += i;
				if(i == end) {
					break;
				}
				i++;
			}
			
			System.out.println(init+"~"+end+" ??:"+sum);
		}
		
		//scanner.close();
	}

}
