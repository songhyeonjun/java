package third_project;

public class Switch3 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ�ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
		
		String upper = " aB cd E ";
		System.out.println(upper.toUpperCase());
		System.out.println(upper.toLowerCase());
		System.out.println(upper.trim());
		System.out.println(upper.replace(" ", ""));
	}

}
