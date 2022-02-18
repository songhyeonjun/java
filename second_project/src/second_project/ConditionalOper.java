package second_project;

public class ConditionalOper {

	public static void main(String[] args) {
		int score = 85;
		//char grade = (score > 90) ? 'A' : 'B';
		
		char grade;
		if(score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		System.out.println(score+" 점은 "+grade+"학점입니다.");
	}

}
