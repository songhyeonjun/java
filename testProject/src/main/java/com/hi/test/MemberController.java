package com.hi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MemberController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("create")
	public String create(MemberVO vo) throws Exception {
		System.out.println("회원가입 제어 요청됨.");
		int result = dao.create(vo);
		
		if(result == 1) {
			return "ok";
		}
		else {
			return "no";
		}
		
	}
}
