package third_project;

public class Switch {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;		
		System.out.println("���ڴ�?"+num);
		
		switch(num) {
			case 1:
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			case 6:
				System.out.println("���� ���Խ��ϴ�.");
				break;
			default : 
				System.out.println("���ڰ� �ȳ��Խ��ϴ�.");
		}
	}

}
