package third_project;

public class Switch2 {

	//Math.random : 0 ~ 0.9999
	public static void main(String[] args) {
		//8 <= ���� <= 11 
		int time = (int)(Math.random()*4)+8;
		System.out.println("[����ð�: "+time+" ��]");
		
		switch(time){
			case 8 :
				System.out.println("��� �մϴ�.");
			case 9 :
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10 :
				System.out.println("������ ���ϴ�.");
			default :
				System.out.println("�ܱ��� �մϴ�.");
		}
	}

}
