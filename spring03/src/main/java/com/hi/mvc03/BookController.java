package com.hi.mvc03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링이라는 프로그램에 컨트롤러 등장
public class BookController {
	
	@RequestMapping("bookcreate")
	public void bookcreate(BookVO vo, BookDAO dao) throws Exception {
		System.out.println("북마크 제어 요청됨.");
		// 1. 입력한 값 받아오기
		// 2. vo만들어서 넣기
		System.out.println(vo);
		// 3. dao한테 vo주면서 create호출(요청)
		dao.create(vo);
	}
}

