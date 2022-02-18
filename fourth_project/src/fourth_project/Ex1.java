package fourth_project;
/**
 * @author hi
 *
 * 배열에 임의의 숫자 5개를 넣고 최대값을 찾으세요.
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
