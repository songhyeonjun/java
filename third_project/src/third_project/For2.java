package third_project;

public class For2 {

	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println("1~10 합:"+sum);
		
		System.out.println("1~10까지의 정수중 짝수");
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("1~10까지의 정수중 홀수");
		for(int i=1;i<=10;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("1~10까지의 정수중 3의배수");
		for(int i=1;i<=10;i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("1~100까지의 정수중"
				+ " 3의 배수이면서 2의 배수인 수");
		for(int i=1;i<=100;i++) {
			if(i%3 == 0 || i%2 ==0 && i%5 ==0) {
				System.out.println(i);
			}
		}
	}

}
