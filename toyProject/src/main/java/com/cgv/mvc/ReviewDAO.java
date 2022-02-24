package com.cgv.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReviewDAO {
	
	@Autowired
	SqlSessionTemplate my; // di
	
	public List<ReviewVO> all() {
		return my.selectList("review.list");
	}
	
	public int reviewInsert(ReviewVO vo) {
		return my.insert("review.insert", vo);
	}
	
	public void reviewDelete(ReviewVO vo) {
		my.delete("review.delete", vo);
	}
}
