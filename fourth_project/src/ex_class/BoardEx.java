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
		board.setName("이카루스");
		board.setContents("동해물과 백두산이\n마르고 닳토록");
		board.setTitle("애국가");
		board.setRgstdate(new Date(cal.getTimeInMillis()));
		
		Board board2 = new Board();
		board2.setIdx(2);
		board2.setId("fruits");
		board2.setName("과일");
		board2.setContents("사과\n배\n딸기");
		board2.setTitle("내가 좋아하는 과일");
		board2.setRgstdate(new Date());
		
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(board);
		list.add(board2);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		
		//for(int i=0;i<list.size();i++) {
		for(Board bo : list) {
			//Board boardreturn = (Board)list.get(i);
//			System.out.println("시퀀스:"+boardreturn.getIdx());
//			System.out.println("아이디:"+boardreturn.getId());
//			System.out.println("제목:"+boardreturn.getTitle());
//			System.out.println("글쓴이:"+boardreturn.getName());
//			System.out.println("내용:"+boardreturn.getContents());
//			System.out.println("등록일:"+simpleDateFormat.format(boardreturn.getRgstdate()));
//			System.out.println("====================================");
			System.out.println("시퀀스:"+bo.getIdx());
			System.out.println("아이디:"+bo.getId());
			System.out.println("제목:"+bo.getTitle());
			System.out.println("글쓴이:"+bo.getName());
			System.out.println("내용:"+bo.getContents());
			System.out.println("등록일:"+simpleDateFormat.format(bo.getRgstdate()));
			System.out.println("====================================");
		}
	}

}
