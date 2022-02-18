package pack02.subPack;

public class RommMain {

	public static void main(String[] args) {
		//필요한 tv 2대 가져다 놔주세요
		TV myTv = new TV();
		TV youTv = new TV();	
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
		// 첫번째 tv에 ch, vol, onOff값 
		// 그림과 비교
		// 전체 변수가 몇 개?
		System.out.println("myTv : " + myTv);
	
		
		// 생성된 객체의 주소를 가지고 멤버메서드를 호출할 수 있다.
		myTv.on(10);
		
		// 2번째 tv에 멤버변수값을 넣어보고, 멤버변수를 프린트
		youTv.ch = 9;
		youTv.vol = 12;
		youTv.onOff = true;
		System.out.println("youTv : " + youTv);
		
		
		PHONE phone = new PHONE(); // 5개가 만
		
		phone.color = "빨강";
		phone.name = "갤럭시";
		phone.price = 100;
		phone.size = 200;
		System.out.println(phone);
		
	}

}
