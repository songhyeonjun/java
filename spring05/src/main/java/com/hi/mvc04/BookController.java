package com.hi.mvc04;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링이라는 프로그램에 컨트롤러로 등록
public class BookController {
	//@
	//hera@naver.com (at -에)
	//Annotation (표시, 어노테이션)
	
	@Autowired
	BookDAO dao; //주소주입!!
	//회원과 관련된 여러가지 제어를 담당하는 클래스 
	//회원가입,검색,수정,탈퇴,로그인 기능을 제어함.
	
	@RequestMapping("money.do")
	public void ajax3(double money, int choice, Model model) {
		switch (choice) {
		case 1:
			money = money * 0.7;
			break;
		case 2:
			money = money * 0.9;
			break;
		}
		model.addAttribute("moneyResult", (int)money);
	}
	
	@RequestMapping("ajax1")
	public void ajax1(String phone, Model model) {
		//01045671234
		System.out.println("ajax1호출됨.");
		System.out.println("전달받은 전화번호 " + phone);
		String no = "";
		//세글자 010 --> 111
		//      011 --> 222
		//      나머지 --> 333 
		//랜덤한값 3글자 만들어서 plus
		String pre = phone.substring(0,3);
		if(pre.equals("010")) {
			no = no + "111";
		}else if (pre.equals("011")) {
			no = no  + "222";
		}else {
			no = no  + "333";
		}
		
		Random r = new Random();
		int no2 = r.nextInt(900) + 100; //0~99, 100~999
		//899 + 100 => 999
		no = no + no2;
		
		System.out.println("전송할 인증번호" + no);
		//views까지 no값을 전달하고 ram에서 제거하고자 하는 경우
		//model객체의 속성으로 지정!
		model.addAttribute("no", no);
		
	}
	
	@RequestMapping("insert.do")
	public void insert(BookVO vo, BookDAO dao) {
		System.out.println("북마크 제어 요청됨.");
		dao.create(vo);
	}
	
	@RequestMapping("all2")
	public void all(Model model) {
		List<BookVO> list = dao.all();
		model.addAttribute("list", list);
		System.out.println(list.size());
	}
	
	@RequestMapping("one2")
	public void one(BookVO vo, Model model) {
		BookVO one = dao.read(vo);
		model.addAttribute("one", one);
	}
}
