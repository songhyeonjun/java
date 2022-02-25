package com.hi.mvc01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlTest {
	
	public static void main(String[] args) {
		// 1. 사이트에 연결(http요청)
		// 2. html문서를 받아온다.(http응답)
		// 3. 추출하고자 하는 위치를 찾아서 해당 노드를 가지고 온다.
		//    결과는 list자료구조를 사용
		//    기존에 ArrayList를 재사용해서 기능을 더 붙여놓은 
		//    Elements(상속해서 만들어 놓음)
		String url = "https://finance.naver.com/item/main.naver?code=005930";
		
		try {
			Document doc = Jsoup.connect(url).get();
//			System.out.println(doc);
			Elements list = doc.select("span.code");
			System.out.println(list.size());
			System.out.println(list.get(0).text());
			
//			Elements list2 = doc.select("span.tx");
//			System.out.println(list2.size());
//			System.out.println(list2.get(6).text());
//			
//			Elements list3 = doc.select("em.date");
//			System.out.println(list3.size());
//			System.out.println(list3);
			// 
//			Elements list4 = doc.select("div.today span.blind");
//			System.out.println(list4.size());
//			System.out.println(list4.get(0).text());
			
//			Elements list5 = doc.select("td.first");
//			System.out.println(list5.size());
//			System.out.println(list5.text());
			
			Elements list6 = doc.select("table > tbody > tr:nth-child(1) > td:nth-child(2) span.blind");
			System.out.println(list6.size());
			System.out.println(list6.text());
			
			Elements list7 = doc.select("td.firstr span.blind");
			System.out.println(list7.get(0).text());
			
		} catch (IOException e) {
			System.out.println("크롤링하는 중 에러 발생...");
			e.printStackTrace();
		}
	}
}
