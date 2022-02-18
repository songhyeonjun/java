package first_project;

public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		char c7 = '��';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		//------------------------------
		char ch1 = '9';
		int i1 = ch1 - '0';//57 - 48 =9
		System.out.println(ch1);
		System.out.println(i1);
		
		int asciiValue = '0';
		System.out.println("ASCII Numeric Value: "+asciiValue);
		
	}

}
