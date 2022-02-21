package com.hi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 싱글톤 객체로 생성(주소)
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my; // 전역변수
	// 싱글톤으로 만든 mybatis 객체의 주소를 찾아서 my변수에 넣기
	// DAO 부품안에 myBatis 부품을 끼워 넣음
	// Dependency(의존성) Injection(주입) : 의존성 주입(DI)
	// 의존성 : 해당 부품이 반드시 필요하다는 의미
	// 의존성을 구현하고 싶으면 ram에 만들어 놓은 주소를 쓰는 클래스의 
	// 변수에 주소를 넣음
	
	public void create(BookVO vo) {
		System.out.println("dao에서 전달받은 값 : " + vo);
		my.insert("book.creat", vo);
	}
	public BookVO read(BookVO vo) {
		return my.selectOne("book.one", vo);
	}
	public List<BookVO> all() {
		return my.selectList("book.all");
	}
	public int delete(BookVO vo) {
		return my.delete("book.all", vo);
	}
	public int update() throws Exception {
		return my.update("book.up");
	}
}
