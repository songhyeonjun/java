package fourth_project;

public class ArrayCreate {

	public static void main(String[] args) {
		int sum = add(new int[] {83,92,50,50,30});
		System.out.println("����:"+sum);
		
		int[] array = {50,60,70,80,90,70,80};
		System.out.println("����:"+add(array));
	}
	
	/**
	 * ���� �迭�� ���� ���ϴ� �Լ�
	 * @param scores
	 * @return
	 */
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}

}
