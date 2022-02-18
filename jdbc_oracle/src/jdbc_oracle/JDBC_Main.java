package jdbc_oracle;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Main {

	public static void main(String[] args) {

		DataBase db = new DataBase();
		Connection con = db.getConnection();
		
		UsersDAO usDAO = new UsersDAO(con);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("회원(1:등록,  2:수정,  3:뷰,  4:삭제,  5:목록   q:끝내기)");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {//프로그램 끝내기
				System.out.println("수고하셨습니다.");
				break;
			}
			else if(ch_num.equals("5")) {//회원목록
				PrintUtil.print_list(usDAO.list());
			}
			else if(ch_num.equals("1")) {//회원등록
				
				UsersVO UsersVo = new UsersVO();
				System.out.print("학생이름 : ");
				UsersVo.setU_NAME(scanner.nextLine());
		    	System.out.println("아이디 : ");
		    	UsersVo.setU_ID(scanner.nextLine());
		    	System.out.print("패스워드 : ");
		    	UsersVo.setU_PW(scanner.nextLine());
				
		    	//---- 회원정보 입력
		    	//---- 회원정보 DB 등록
		    	usDAO.insert(UsersVo);
		    	//---- 회원정보 DB 등록
		    	//---- 회원목록 가져오기
		    	PrintUtil.print_list(usDAO.list());
		    	//---- 회원목록 가져오기
		    }
			else if(ch_num.equals("3")) {//회원정보 뷰
				System.out.print("유저 시퀀스 : ");
				PrintUtil.print_view(usDAO.view(Integer.parseInt(scanner.nextLine())));
			}
			else if(ch_num.equals("2")) {//회원정보 수정
				UsersVO UsersVo = new UsersVO();
				System.out.print("학생 시퀀스 : ");
				UsersVo.setU_IDX(Integer.parseInt(scanner.nextLine()));
				System.out.print("학생 이름 : ");
				UsersVo.setU_NAME(scanner.nextLine());
				System.out.print("아이디 : ");
				UsersVo.setU_ID(scanner.nextLine());
				System.out.print("패스워드 : ");
				UsersVo.setU_PW(scanner.nextLine());
				//---- 회원정보 수정에 필요한 데이터 준비
				//---- 회원정보 수정
				usDAO.update(UsersVo);
				//---- 회원정보 수정
				//---- 회원정보 확인
				PrintUtil.print_view(usDAO.view(UsersVo.getU_IDX()));
				//---- 회원정보 확인
			}
			else if(ch_num.equals("4")) {// 회원정보 삭제
				//---- 회원삭제
				System.out.print("학생 시퀀스 : ");
				usDAO.delete(Integer.parseInt(scanner.nextLine()));
				//---- 회원삭제
				//---- 회원목록 가져오기
				PrintUtil.print_list(usDAO.list());
			//---- 회원목록 가져오기
			}
		}
		
		//---- 학생을 한명을 등록해 봅시다.
//		StudentVO studentVo = new StudentVO();
//		studentVo.setS_name("이순신");
//		studentVo.setS_gender("1");
//		stDAO.insert(studentVo);
		
		//---- 학생 정보를 하나 가져옵니다.
//		StudentVO studentVo = stDAO.view(14);
//		PrintUtil.print_view(studentVo);
		
		//---- 학생 정보를 하나 수정
//		StudentVO studentVo = new StudentVO();
//		studentVo.setS_idx(1);
//		studentVo.setS_name("강철수");
//		studentVo.setS_gender("1");
//		stDAO.update(studentVo);
		
		//---- 3번 학생 정보를 하나 가져옵니다.
//		PrintUtil.print_view(stDAO.view(1));
		
		//----- 학생 한명을 삭제
//		stDAO.delete(1);
//		ArrayList<StudentVO> list = stDAO.list();
//		PrintUtil.print_list(list);
		
		
		//---- 학생 목록
//		ArrayList<StudentVO> list = stDAO.list();
//		PrintUtil.print_list(list);
		scanner.close();
		
		try {
			con.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
