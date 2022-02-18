package jdbc_mvc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PrintUtil {

	public static void print_list(ArrayList<StudentsVO> list) {
		String std_gender = "";
		String std_duty   = "";
		System.out.println("������ | ���� | ������� | �̸� | �޴��� | ���� | �����");
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� a hh:mm");
		for(StudentsVO studentsVo : list) {
			if(studentsVo.getD_name() == null) {
				std_duty = "���л�";
			} else {
				std_duty = studentsVo.getD_name();
			}
			if(studentsVo.getS_gender().equals("1")) {
				std_gender = "����";
			} else {
				std_gender = "����";
			}
			
			System.out.println(studentsVo.getS_idx()+"|"+
				std_gender+"|"+studentsVo.getS_birth()+"|"+studentsVo.getS_name()+"|"+studentsVo.getS_phone()+"|"+
				std_duty+"|"+format.format(studentsVo.getS_rgstdate()));
		}
	}
	
	public static void print_view(StudentsVO studentsVo) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� a hh:mm");
		System.out.println("============================");
		System.out.println("������:"+studentsVo.getS_idx());
		System.out.println("�̸�:"+studentsVo.getS_name());
		System.out.println("�������:"+studentsVo.getS_birth());
		System.out.println("�޴���:"+studentsVo.getS_phone());
		if(studentsVo.getS_gender().equals("1")) {
			System.out.println("����:����");	
		} else {
			System.out.println("����:����");
		}
		if(studentsVo.getD_name() == null) {
			System.out.println("����:���л�");	
		} else {
			System.out.println("����:"+studentsVo.getD_name());
		}
		if(studentsVo.getS_mdfydate() == null) {
			System.out.println("������:����");
		} else {
			System.out.println("������:"+format.format(studentsVo.getS_mdfydate()));
		}
		System.out.println("�����:"+format.format(studentsVo.getS_rgstdate()));
		System.out.println("============================");
	}
	
	
	
	
	
	
	
	
	
	
	
}
