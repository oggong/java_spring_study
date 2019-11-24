package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVO;

@Controller
@RequestMapping("/re")
public class RequesetMappingController {
	
	@RequestMapping("/request.do")
	public void request(MemberVO vo) {
		System.out.println("re/reqeust.do 요청");
		System.out.println(vo.getId()+":입력확인");
		System.out.println(vo.getName()+":입력확인");
		System.out.println(vo.getAge()+":입력확인");
	}
	//**********
	// 리턴형이 void 이면 요청이름과 동일한 뷰 페이지 지정
	
	

}
