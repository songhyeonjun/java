package jdbc_mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC_Main {

	public static void main(String[] args) {
		DataBase db = new DataBase();
		Connection con = db.getConnection();		
		StudentsDAO stDAO = new StudentsDAO(con);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("회원(1:등록, 2:수정, 3:뷰, 4:삭제, 5:목록, q:끝내기):");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {//프로그램 끝내기
				System.out.println("안녕히계세요~");
				break;
			}else if(ch_num.equals("5")) {//회원목록
				PrintUtil.print_list(stDAO.list());
			}else if(ch_num.equals("1")) {//회원등록
				//----- 회원정보 입력
				StudentsVO studentsVo = new StudentsVO();
				System.out.print("학생이름:");
				studentsVo.setS_name(scanner.nextLine());
				System.out.print("성별(1:남자, 2:여자):");
				studentsVo.setS_gender(scanner.nextLine());
				System.out.print("휴대폰번호:");
				studentsVo.setS_phone(scanner.nextLine());
				System.out.print("생년월일:");
				studentsVo.setS_birth(scanner.nextLine());
				//----- 회원정보 입력
				//----- 회원정보 DB 등록
				stDAO.insert(studentsVo);
				//----- 회원정보 DB 등록
				//----- 회원목록 가져오기
				PrintUtil.print_list(stDAO.list());
				//----- 회원목록 가져오기
			}else if(ch_num.equals("3")) {//회원정보뷰
				System.out.print("학생시퀀스:");
				/*String s_idx = scanner.nextLine();
				int s_idx_num = Integer.parseInt(s_idx);
				StudentsVO studentsVo = stDAO.view(s_idx_num);
				PrintUtil.print_view(studentsVo);*/
				PrintUtil.print_view(
					stDAO.view(Integer.parseInt(scanner.nextLine()))
				);
			} else if(ch_num.equals("2")) {//회원정보 수정
				//---- 회원정보 수정에 필요한 데이터 준비
				StudentsVO studentsVo = new StudentsVO();
				System.out.print("학생시퀀스:");
				studentsVo.setS_idx(Integer.parseInt(scanner.nextLine()));
				System.out.print("학생이름:");
				studentsVo.setS_name(scanner.nextLine());
				System.out.print("학생성별(1:남자,2:여자):");
				studentsVo.setS_gender(scanner.nextLine());
				System.out.print("휴대폰:");
				studentsVo.setS_phone(scanner.nextLine());
				System.out.print("생년월일:");
				studentsVo.setS_birth(scanner.nextLine());
				//---- 회원정보 수정에 필요한 데이터 준비
				//---- 회원정보 수정
				stDAO.update(studentsVo);
				//---- 회원정보 수정
				//---- 회원정보 확인
				PrintUtil.print_view(
					stDAO.view(studentsVo.getS_idx())
				);
				//---- 회원정보 확인
			}else if(ch_num.equals("4")) {//회원삭제
				//---- 회원삭제
				System.out.print("학생시퀀스:");
				stDAO.delete(Integer.parseInt(scanner.nextLine()));
				//---- 회원삭제
				//----- 회원목록 가져오기
				PrintUtil.print_list(stDAO.list());
				//----- 회원목록 가져오기
			}
		}
		
		//---- 학생을 한명 등록해봅시다.
		/*StudentsVO studentsVo = new StudentsVO();
		studentsVo.setS_name("이순신");
		studentsVo.setS_gender("1");
		stDAO.insert(studentsVo);*/
		
		//---- 학생정보를 하나 가져옵니다.
		/*StudentsVO studentsVo = stDAO.view(3);
		PrintUtil.print_view(studentsVo);*/
		
		//---- 학생정보를 하나 수정
//		StudentsVO studentsVo = new StudentsVO();
//		studentsVo.setS_idx(3);
//		studentsVo.setS_name("박탐희");
//		studentsVo.setS_gender("2");
//		stDAO.update(studentsVo);
		
		//---- 3번 학생정보를 하나 가져옵니다.
		//PrintUtil.print_view(stDAO.view(3));		
		
		//---- 학생 목록
		/*ArrayList<StudentsVO> list = stDAO.list();
		PrintUtil.print_list(list);*/
		
		//---- 학생 한명 삭제
		//stDAO.delete(15);
		scanner.close();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}