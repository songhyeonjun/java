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
			System.out.print("ȸ��(1:���,  2:����,  3:��,  4:����,  5:���   q:������)");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {//���α׷� ������
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
			else if(ch_num.equals("5")) {//ȸ�����
				PrintUtil.print_list(usDAO.list());
			}
			else if(ch_num.equals("1")) {//ȸ�����
				
				UsersVO UsersVo = new UsersVO();
				System.out.print("�л��̸� : ");
				UsersVo.setU_NAME(scanner.nextLine());
		    	System.out.println("���̵� : ");
		    	UsersVo.setU_ID(scanner.nextLine());
		    	System.out.print("�н����� : ");
		    	UsersVo.setU_PW(scanner.nextLine());
				
		    	//---- ȸ������ �Է�
		    	//---- ȸ������ DB ���
		    	usDAO.insert(UsersVo);
		    	//---- ȸ������ DB ���
		    	//---- ȸ����� ��������
		    	PrintUtil.print_list(usDAO.list());
		    	//---- ȸ����� ��������
		    }
			else if(ch_num.equals("3")) {//ȸ������ ��
				System.out.print("���� ������ : ");
				PrintUtil.print_view(usDAO.view(Integer.parseInt(scanner.nextLine())));
			}
			else if(ch_num.equals("2")) {//ȸ������ ����
				UsersVO UsersVo = new UsersVO();
				System.out.print("�л� ������ : ");
				UsersVo.setU_IDX(Integer.parseInt(scanner.nextLine()));
				System.out.print("�л� �̸� : ");
				UsersVo.setU_NAME(scanner.nextLine());
				System.out.print("���̵� : ");
				UsersVo.setU_ID(scanner.nextLine());
				System.out.print("�н����� : ");
				UsersVo.setU_PW(scanner.nextLine());
				//---- ȸ������ ������ �ʿ��� ������ �غ�
				//---- ȸ������ ����
				usDAO.update(UsersVo);
				//---- ȸ������ ����
				//---- ȸ������ Ȯ��
				PrintUtil.print_view(usDAO.view(UsersVo.getU_IDX()));
				//---- ȸ������ Ȯ��
			}
			else if(ch_num.equals("4")) {// ȸ������ ����
				//---- ȸ������
				System.out.print("�л� ������ : ");
				usDAO.delete(Integer.parseInt(scanner.nextLine()));
				//---- ȸ������
				//---- ȸ����� ��������
				PrintUtil.print_list(usDAO.list());
			//---- ȸ����� ��������
			}
		}
		
		//---- �л��� �Ѹ��� ����� ���ô�.
//		StudentVO studentVo = new StudentVO();
//		studentVo.setS_name("�̼���");
//		studentVo.setS_gender("1");
//		stDAO.insert(studentVo);
		
		//---- �л� ������ �ϳ� �����ɴϴ�.
//		StudentVO studentVo = stDAO.view(14);
//		PrintUtil.print_view(studentVo);
		
		//---- �л� ������ �ϳ� ����
//		StudentVO studentVo = new StudentVO();
//		studentVo.setS_idx(1);
//		studentVo.setS_name("��ö��");
//		studentVo.setS_gender("1");
//		stDAO.update(studentVo);
		
		//---- 3�� �л� ������ �ϳ� �����ɴϴ�.
//		PrintUtil.print_view(stDAO.view(1));
		
		//----- �л� �Ѹ��� ����
//		stDAO.delete(1);
//		ArrayList<StudentVO> list = stDAO.list();
//		PrintUtil.print_list(list);
		
		
		//---- �л� ���
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
