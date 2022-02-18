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
			System.out.print("ȸ��(1:���, 2:����, 3:��, 4:����, 5:���, q:������):");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {//���α׷� ������
				System.out.println("�ȳ����輼��~");
				break;
			}else if(ch_num.equals("5")) {//ȸ�����
				PrintUtil.print_list(stDAO.list());
			}else if(ch_num.equals("1")) {//ȸ�����
				//----- ȸ������ �Է�
				StudentsVO studentsVo = new StudentsVO();
				System.out.print("�л��̸�:");
				studentsVo.setS_name(scanner.nextLine());
				System.out.print("����(1:����, 2:����):");
				studentsVo.setS_gender(scanner.nextLine());
				System.out.print("�޴�����ȣ:");
				studentsVo.setS_phone(scanner.nextLine());
				System.out.print("�������:");
				studentsVo.setS_birth(scanner.nextLine());
				//----- ȸ������ �Է�
				//----- ȸ������ DB ���
				stDAO.insert(studentsVo);
				//----- ȸ������ DB ���
				//----- ȸ����� ��������
				PrintUtil.print_list(stDAO.list());
				//----- ȸ����� ��������
			}else if(ch_num.equals("3")) {//ȸ��������
				System.out.print("�л�������:");
				/*String s_idx = scanner.nextLine();
				int s_idx_num = Integer.parseInt(s_idx);
				StudentsVO studentsVo = stDAO.view(s_idx_num);
				PrintUtil.print_view(studentsVo);*/
				PrintUtil.print_view(
					stDAO.view(Integer.parseInt(scanner.nextLine()))
				);
			} else if(ch_num.equals("2")) {//ȸ������ ����
				//---- ȸ������ ������ �ʿ��� ������ �غ�
				StudentsVO studentsVo = new StudentsVO();
				System.out.print("�л�������:");
				studentsVo.setS_idx(Integer.parseInt(scanner.nextLine()));
				System.out.print("�л��̸�:");
				studentsVo.setS_name(scanner.nextLine());
				System.out.print("�л�����(1:����,2:����):");
				studentsVo.setS_gender(scanner.nextLine());
				System.out.print("�޴���:");
				studentsVo.setS_phone(scanner.nextLine());
				System.out.print("�������:");
				studentsVo.setS_birth(scanner.nextLine());
				//---- ȸ������ ������ �ʿ��� ������ �غ�
				//---- ȸ������ ����
				stDAO.update(studentsVo);
				//---- ȸ������ ����
				//---- ȸ������ Ȯ��
				PrintUtil.print_view(
					stDAO.view(studentsVo.getS_idx())
				);
				//---- ȸ������ Ȯ��
			}else if(ch_num.equals("4")) {//ȸ������
				//---- ȸ������
				System.out.print("�л�������:");
				stDAO.delete(Integer.parseInt(scanner.nextLine()));
				//---- ȸ������
				//----- ȸ����� ��������
				PrintUtil.print_list(stDAO.list());
				//----- ȸ����� ��������
			}
		}
		
		//---- �л��� �Ѹ� ����غ��ô�.
		/*StudentsVO studentsVo = new StudentsVO();
		studentsVo.setS_name("�̼���");
		studentsVo.setS_gender("1");
		stDAO.insert(studentsVo);*/
		
		//---- �л������� �ϳ� �����ɴϴ�.
		/*StudentsVO studentsVo = stDAO.view(3);
		PrintUtil.print_view(studentsVo);*/
		
		//---- �л������� �ϳ� ����
//		StudentsVO studentsVo = new StudentsVO();
//		studentsVo.setS_idx(3);
//		studentsVo.setS_name("��Ž��");
//		studentsVo.setS_gender("2");
//		stDAO.update(studentsVo);
		
		//---- 3�� �л������� �ϳ� �����ɴϴ�.
		//PrintUtil.print_view(stDAO.view(3));		
		
		//---- �л� ���
		/*ArrayList<StudentsVO> list = stDAO.list();
		PrintUtil.print_list(list);*/
		
		//---- �л� �Ѹ� ����
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