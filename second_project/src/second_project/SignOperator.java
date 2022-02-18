package second_project;

public class SignOperator {

	public static void main(String[] args) {
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		int result2_1 = x * -1;
		int result3 = +result2;
		int result4 = -result2;
		int result4_1 = result2 * -1;
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result2_1:"+result2_1);
		System.out.println("result3:"+result3);
		System.out.println("result4:"+result4);
		System.out.println("result4_1:"+result4_1);
		
		byte b = 100;
		//byte result5 = -b;
		int result5 = -b;
		System.out.println("result5:"+result5);
		
		float f = 3.14f;
		float result6 = -f;
		System.out.println("result6:"+result6);
		
		double d = 3.141592653259;
		double result7 = -d;
		System.out.println("result7:"+result7);
	}

}
