package com.cgv.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 서버가 요청 받은 주소를 컨트롤할 수 있는 객체로 등록, 싱글톤을 만들어달라고 스프링에게 요청
public class ReviewController {
	
	@Autowired
	ReviewDAO dao;
	
	@RequestMapping("rInsert")
	public void insert(ReviewVO vo, Model model) {
		int result = dao.reviewInsert(vo);
		if(result == 1) {
			model.addAttribute("one", vo);
		}
	}
	
	@RequestMapping("rDelete")
	public void delete(ReviewVO vo, Model model) {
		dao.reviewDelete(vo);
	}
}
