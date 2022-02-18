package fourth_project;

public class MainString {
	//java MainString 10 20
	public static void main(String[] args) {
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(result);
	}

}
