package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
//		MemberBean mem = context.getBean("mem",MemberBean.class); // MemberBean.class 형변환
//		mem.output();
//		
//		MemberBean mem2 = context.getBean("mem2",MemberBean.class); // MemberBean.class 형변환
//		mem2.output();
		
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		dao.insert();
		MemberDAO dao2 = context.getBean("dao2",MemberDAO.class);
		dao2.insert();
	}
		

}
