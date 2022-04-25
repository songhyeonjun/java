package com.hi.mvcProject;

public interface MemberInter {

	// 회원가입
	int create(MemberVO vo);

	// 로그인
	MemberVO login(MemberVO vo);

}