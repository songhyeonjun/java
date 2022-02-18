package jdbc_mvc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PrintUtil {

	public static void print_list(ArrayList<StudentsVO> list) {
		String std_gender = "";
		String std_duty   = "";
		System.out.println("시퀀스 | 성별 | 생년월일 | 이름 | 휴대폰 | 직함 | 등록일");
		SimpleDateFormat format = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
		for(StudentsVO studentsVo : list) {
			if(studentsVo.getD_name() == null) {
				std_duty = "반학생";
			} else {
				std_duty = studentsVo.getD_name();
			}
			if(studentsVo.getS_gender().equals("1")) {
				std_gender = "남자";
			} else {
				std_gender = "여자";
			}
			
			System.out.println(studentsVo.getS_idx()+"|"+
				std_gender+"|"+studentsVo.getS_birth()+"|"+studentsVo.getS_name()+"|"+studentsVo.getS_phone()+"|"+
				std_duty+"|"+format.format(studentsVo.getS_rgstdate()));
		}
	}
	
	public static void print_view(StudentsVO studentsVo) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
		System.out.println("============================");
		System.out.println("시퀀스:"+studentsVo.getS_idx());
		System.out.println("이름:"+studentsVo.getS_name());
		System.out.println("생년월일:"+studentsVo.getS_birth());
		System.out.println("휴대폰:"+studentsVo.getS_phone());
		if(studentsVo.getS_gender().equals("1")) {
			System.out.println("성별:남자");	
		} else {
			System.out.println("성별:여자");
		}
		if(studentsVo.getD_name() == null) {
			System.out.println("직함:반학생");	
		} else {
			System.out.println("직함:"+studentsVo.getD_name());
		}
		if(studentsVo.getS_mdfydate() == null) {
			System.out.println("수정일:없음");
		} else {
			System.out.println("수정일:"+format.format(studentsVo.getS_mdfydate()));
		}
		System.out.println("등록일:"+format.format(studentsVo.getS_rgstdate()));
		System.out.println("============================");
	}
	
	
	
	
	
	
	
	
	
	
	
}
