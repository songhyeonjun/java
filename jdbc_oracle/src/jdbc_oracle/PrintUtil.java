package jdbc_oracle;

import java.util.ArrayList;

public class PrintUtil {
	
	public static void print_list(ArrayList<UsersVO> list) {
		
		System.out.println("������ �̸� ���̵� �н����� �����");
		for(UsersVO UsersVo : list) {
			
			System.out.println(UsersVo.getU_IDX() + "   |" + 
					UsersVo.getU_NAME() + " |" + UsersVo.getU_ID() + " |" +
					UsersVo.getU_PW() + "   |" + UsersVo.getU_RGSTDATE());		
			}
		
	}
	
	public static void print_view(UsersVO UsersVo) {
		System.out.println("=============================================");
		System.out.println("������ : " + UsersVo.getU_IDX());
		System.out.println("�̸� : " + UsersVo.getU_NAME());
		System.out.println("���̵� : " + UsersVo.getU_ID());
		System.out.println("�н����� : " + UsersVo.getU_PW());
		System.out.println("����� : " + UsersVo.getU_RGSTDATE());
	}

}
