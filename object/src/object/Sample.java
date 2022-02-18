package object;

class Calculator{
	
	//버스 : 641번, 사람들을 태운다,
	//영등포에서 강남을지나 다시 영등포로 오는 순환경로
	//저기 내가 타야하는 641번 버스는 영등포에서 출발해서
	//강남을 지나 영등포로 다시 돌아오는 순환버스이다.
	int result = 0;
	int add(int num) {
		result += num;
		return result;
	}
}

public class Sample {

	public static void main(String[] args) {
		//----static이 아닌경우
//		Calculator cal = new Calculator();		
//		System.out.println(cal.add(10));
//		System.out.println(cal.add(20));
		//----static인 경우
		//System.out.println(Calculator.add(10));
		//System.out.println(Calculator.add(20));
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		
		System.out.println(cal2.add(30));
		System.out.println(cal2.add(50));
	}
}




