package third_project;

public class Switch3 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
		
		String upper = " aB cd E ";
		System.out.println(upper.toUpperCase());
		System.out.println(upper.toLowerCase());
		System.out.println(upper.trim());
		System.out.println(upper.replace(" ", ""));
	}

}
