package second_project;

public class LogicOper {

	public static void main(String[] args) {
		int charCode = '0';//65
		System.out.println("charCode:"+charCode);
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요.");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요.");
		}
		
//		if(!(charCode < 48) & !(charCode > 57)) {
//			System.out.println("0~9 숫자 이군요.");
//		}
		
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("0~9 숫자 이군요.");
		}
	}

}
