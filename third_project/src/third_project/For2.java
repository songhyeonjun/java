package third_project;

public class For2 {

	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println("1~10 ��:"+sum);
		
		System.out.println("1~10������ ������ ¦��");
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("1~10������ ������ Ȧ��");
		for(int i=1;i<=10;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("1~10������ ������ 3�ǹ��");
		for(int i=1;i<=10;i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("1~100������ ������"
				+ " 3�� ����̸鼭 2�� ����� ��");
		for(int i=1;i<=100;i++) {
			if(i%3 == 0 || i%2 ==0 && i%5 ==0) {
				System.out.println(i);
			}
		}
	}

}