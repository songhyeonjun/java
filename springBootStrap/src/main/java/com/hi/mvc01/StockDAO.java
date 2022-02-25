package com.hi.mvc01;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class StockDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(StockVO vo) {
		my.insert("finance.create", vo);
	}
}
