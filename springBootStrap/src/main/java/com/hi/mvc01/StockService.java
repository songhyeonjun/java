package com.hi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Autowired
	StockDAO dao;
	
	public void crawl(String cond) {
		
	}
}
