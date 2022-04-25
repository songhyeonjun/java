package com.hi.mvcProject.high;

import com.hi.mvcProject.MemberVO;

public interface MemberDAOInterface {

	// 구현할 기능에 대해 정의하는 문서 역할
	// 기능만 정의한다. 구현은 X
	// 반환값, 메서드이름, 입력값 정의까지만 함
	public int insert(MemberVO vo);
	public int update(MemberVO vo);
	public int delete(MemberVO vo);
	public MemberVO readOne(MemberVO vo);
	public int login(MemberVO vo);
}
