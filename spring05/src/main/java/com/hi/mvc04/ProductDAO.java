package com.hi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //싱글톤으로 만들어달라고 스프링에게 요청
public class ProductDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void create(ProductVO vo) {
		my.insert("product.create", vo);
	}
	public boolean login(ProductVO vo) {
		return my.selectOne("product.login", vo);
	}
	public MemberVO readOne(ProductVO vo) {
		return my.selectOne("product.one", vo);
		
	}
	public List<ProductVO> readAll() {
		return my.selectList("product.all");
		
	}
	public void update(ProductVO vo) {
		my.update("product.up", vo);
	}
	public void delete(ProductVO vo) {
		my.delete("product.del", vo);
	}
}
