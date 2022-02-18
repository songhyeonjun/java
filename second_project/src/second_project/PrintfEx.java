package second_project;

public class PrintfEx {

	public static void main(String[] args) {
		int value = 12300;
		System.out.printf("상품의 가격:%d원\n", value);//정수형 출력
		System.out.printf("상품의 가격:%6d원\n", value);//6자리공간
		System.out.printf("상품의 가격:%-6d원\n", value);//뒤로6자리공간
		System.out.printf("상품의 가격:%06d원\n", value);//빈공간은 0으로 채우기
		
		double area = 3.14159 * 10 * 10; 
		//double area = 3.14159;
		System.out.printf("반지름이 %d인 원의 넒이:%10s\n",10,area);
		
		String name = "홍길동";
		String job = "의적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
