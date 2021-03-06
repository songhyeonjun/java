package com.hi.mvc04;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링이라는 프로그램에 컨트롤러 등장
public class BookController {
	
	@RequestMapping("ajax1")
	public void ajax(String phone, Model model) {
		System.out.println("ajax1호출됨");
		System.out.println("전달받은 전화번호 " + phone);
		String no = "";
		// 세글자 010 --> 111
		//		011 --> 222
		//		나머지 --> 333
		// 랜덤한 값 3글자 만들어서 plus
		String pre = phone.substring(0, 3);
		if(pre.equals("010")) {
			no = no + "111";
		}
		else if(pre.equals("011")) {
			no = no + "222";
		}
		else {
			no = no + "333";
		}
		
		Random r = new Random();
		int no2 = r.nextInt(900) + 100;
		no = no + no2;
		
		System.out.println("전송할 인증번호" + no);
		// views까지 no값을 전달하고 ram에서 제거하고자 하는 
		// model객체의 속성으로 지정!
		model.addAttribute("no", no);
	}
	
	@RequestMapping("insert.do")
	public void insert(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("북마크 제어 요청됨.");
		// 1. 입력한 값 받아오기
		// 2. vo만들어서 넣기
		System.out.println(vo);
		// 3. dao한테 vo주면서 create호출(요청)
		dao.insert(vo);
	}
	
	@RequestMapping("money.do")
	public void ajax2(double money, int choice, Model model) {
		System.out.println("ajax2호출됨");
		
		switch (choice) {
		case 1:
			money = money * 0.7;
			break;
		case 2:
			money = money * 0.9;
			break;
		case 3:
			break;
		}
		model.addAttribute("moneyResult", money);
	}
}

