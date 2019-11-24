package ex2_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	@Autowired
	//@Resource  두개 이상 값을 선택할경우 추가 
	@Qualifier("memberBean2")
	private MemberBean member;
	
	//생성자
	//public MemberDAO() {};
	
//	public MemberDAO(MemberBean member) {
//		this.member = member;
//	}
	//public void setMember(MemberBean member) {
	//	this.member = member;
		
	//}
	public void insert() {
		System.out.println(member.getName()+"님 정보" + member.getAge() + member.getMessage());
	}
}
