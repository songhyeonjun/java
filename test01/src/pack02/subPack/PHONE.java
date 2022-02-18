package pack02.subPack;

public class PHONE {
	String name; // 선언! 전역변수!(global), 변수의 자동 초기화
	String color;
	int size;
	int price;
	
	// 멤버메서드 2개
	public void tel(String no) {
		System.out.println(no + "로 전화를 걸다");
	}
	public void kakao(String name) {
		System.out.println(name + "과 카톡한다.");
	}
	
		@Override
		public String toString() {
			return "휴대폰 [이름=" + name + ", 색=" + color + ", 사이즈=" + size + ", 가격=" + price + "]";
		}
}
