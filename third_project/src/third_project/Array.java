package third_project;

public class Array {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87, 90};
//		int[] scores = new int[4];
//		scores[0] = 83;
//		scores[1] = 90;
//		scores[2] = 87;
//		scores[3] = 90;
		
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		System.out.println("scores[3]:"+scores[3]);
		
		int sum = 0;
		//for(int i=0;i<3;i++) {
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"]:"+scores[i]);
			sum += scores[i];
		}
		System.out.println("���� : "+sum);
		double avg = (double)sum / scores.length;
		System.out.println("��� : "+avg);
	}

}
