package second_project;

public class LogicOper {

	public static void main(String[] args) {
		int charCode = '0';//65
		System.out.println("charCode:"+charCode);
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�� �̱���.");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��� �̱���.");
		}
		
//		if(!(charCode < 48) & !(charCode > 57)) {
//			System.out.println("0~9 ���� �̱���.");
//		}
		
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("0~9 ���� �̱���.");
		}
	}

}
