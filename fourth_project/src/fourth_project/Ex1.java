package fourth_project;
/**
 * @author hi
 *
 * �迭�� ������ ���� 5���� �ְ� �ִ밪�� ã������.
 */
public class Ex1 {

	public static void main(String[] args) {
		int max = 0;
		int[] intarr = {30,20,31,23,32};
		
		for(int intar : intarr) {
			if(max<intar) {
				max = intar;
			}
		}
		System.out.println("max:"+max);
	}

}
