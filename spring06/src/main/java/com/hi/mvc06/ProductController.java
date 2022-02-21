package com.hi.mvc06;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링 프레임워크에 컨트롤러 역할의 클래스로 등록 
public class ProductController {

	@Autowired
	ProductDAO dao; //주소주입!!
	//회원과 관련된 여러가지 제어를 담당하는 클래스 
	//회원가입,검색,수정,탈퇴,로그인 기능을 제어함.
	
	

	@RequestMapping("create")
	public void create(ProductVO vo, ProductDAO dao)  {
		System.out.println("회원가입 제어 요청됨.");
		//1. 입력한 값 받아오기 
		//2. vo만들어서 넣기.
		System.out.println(vo);
		//3. dao한테 vo주면서 create호출(요청)
		dao.create(vo);
	}
	@RequestMapping("all")
	public void all(Model model) {
		List<ProductVO> list = dao.readAll();
		model.addAttribute("list", list);
		System.out.println(list.size());
	}
	
	@RequestMapping("one")
	public void one(ProductVO vo, Model model) {
		ProductVO one = dao.read(vo);
		model.addAttribute("one", one);
	}
	@RequestMapping("preup")
	public void preup(ProductVO vo, Model model) {
		ProductVO one = dao.read(vo);
		System.out.println(one);
		model.addAttribute("one", one);
	}
	
	@RequestMapping("del") //핑크화면
	public void del(ProductVO vo) {
		System.out.println("회원탈퇴 제어 요청됨.");
		dao.delete(vo);
	}
	@RequestMapping("up") //핑크화면
	public String up(ProductVO vo)  {
		System.out.println("회원탈퇴 제어 요청됨.");
		int result = dao.update(vo);
		if(result == 0) {
			return "redirect:product.jsp";
		}
		else {
			return "up";
		}
	}
	
}
