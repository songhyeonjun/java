package third_project;

public class IfEx {

	public static void main(String[] args) {
		int score = 91;
		
		if(score >= 90) {
			System.out.println("점수가 90점보다 높습니다.");
			System.out.println("A학점입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80점보다 높습니다.");
			System.out.println("B학점입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70점보다 높습니다.");
			System.out.println("C학점입니다.");
		} else if(score >= 60) {
			System.out.println("점수가 60점보다 높습니다.");
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
	}

}
