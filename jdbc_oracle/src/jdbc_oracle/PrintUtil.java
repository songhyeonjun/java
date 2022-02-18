package jdbc_oracle;

import java.util.ArrayList;

public class PrintUtil {
	
	public static void print_list(ArrayList<UsersVO> list) {
		
		System.out.println("시퀀스 이름 아이디 패스워드 등록일");
		for(UsersVO UsersVo : list) {
			
			System.out.println(UsersVo.getU_IDX() + "   |" + 
					UsersVo.getU_NAME() + " |" + UsersVo.getU_ID() + " |" +
					UsersVo.getU_PW() + "   |" + UsersVo.getU_RGSTDATE());		
			}
		
	}
	
	public static void print_view(UsersVO UsersVo) {
		System.out.println("=============================================");
		System.out.println("시퀀스 : " + UsersVo.getU_IDX());
		System.out.println("이름 : " + UsersVo.getU_NAME());
		System.out.println("아이디 : " + UsersVo.getU_ID());
		System.out.println("패스워드 : " + UsersVo.getU_PW());
		System.out.println("등록일 : " + UsersVo.getU_RGSTDATE());
	}

}
