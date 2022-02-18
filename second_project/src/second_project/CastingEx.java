package second_project;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);

		long longValue = 500L;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//----------------------------
		String str = "1000000";
		int str_int = Integer.parseInt(str);
		System.out.println("str_int:"+str_int);
	}

}
