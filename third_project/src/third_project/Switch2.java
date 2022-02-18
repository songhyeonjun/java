package third_project;

public class Switch2 {

	//Math.random : 0 ~ 0.9999
	public static void main(String[] args) {
		//8 <= 범위 <= 11 
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재시간: "+time+" 시]");
		
		switch(time){
			case 8 :
				System.out.println("출근 합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 :
				System.out.println("업무를 봅니다.");
			default :
				System.out.println("외근을 합니다.");
		}
	}

}
