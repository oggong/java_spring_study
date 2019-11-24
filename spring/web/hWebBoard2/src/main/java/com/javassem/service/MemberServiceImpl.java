package com.javassem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.MemberDAOImpl;
import com.javassem.domain.MemberVO;

// 이 class는 Service 역할을 하겠다.
@Service("memberService")
public class MemberServiceImpl implements MemberService{

	//자동 입력
	@Autowired
	private MemberDAOImpl memberDAO;
	
	
	/**
	  * 아이디 중복 체크하는 sql + 로그인 기능 sql
	  */
	  public MemberVO idCheck_Login( MemberVO vo)
	  {
		  return memberDAO.idCheck(vo);
	  }
	  
	  
	  /**
	   * 회원가입 sql
	   */
	   public int userInsert(MemberVO vo )
	   {
		  return memberDAO.memberInsert(vo);
	   }
}
