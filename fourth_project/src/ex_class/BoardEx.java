package ex_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BoardEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 4, 10);
		
		Board board = new Board();
		board.setIdx(1);
		board.setId("icarus");
		board.setName("��ī�罺");
		board.setContents("���ع��� ��λ���\n������ �����");
		board.setTitle("�ֱ���");
		board.setRgstdate(new Date(cal.getTimeInMillis()));
		
		Board board2 = new Board();
		board2.setIdx(2);
		board2.setId("fruits");
		board2.setName("����");
		board2.setContents("���\n��\n����");
		board2.setTitle("���� �����ϴ� ����");
		board2.setRgstdate(new Date());
		
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(board);
		list.add(board2);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd��");
		
		//for(int i=0;i<list.size();i++) {
		for(Board bo : list) {
			//Board boardreturn = (Board)list.get(i);
//			System.out.println("������:"+boardreturn.getIdx());
//			System.out.println("���̵�:"+boardreturn.getId());
//			System.out.println("����:"+boardreturn.getTitle());
//			System.out.println("�۾���:"+boardreturn.getName());
//			System.out.println("����:"+boardreturn.getContents());
//			System.out.println("�����:"+simpleDateFormat.format(boardreturn.getRgstdate()));
//			System.out.println("====================================");
			System.out.println("������:"+bo.getIdx());
			System.out.println("���̵�:"+bo.getId());
			System.out.println("����:"+bo.getTitle());
			System.out.println("�۾���:"+bo.getName());
			System.out.println("����:"+bo.getContents());
			System.out.println("�����:"+simpleDateFormat.format(bo.getRgstdate()));
			System.out.println("====================================");
		}
	}

}