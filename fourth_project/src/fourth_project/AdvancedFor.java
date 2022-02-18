package fourth_project;

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {50,65,10,34};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum+score;
		}
		
		System.out.println("점수합:"+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = "+avg);
	}
}
