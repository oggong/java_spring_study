package ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	ApplicationContext context = new 
			ClassPathXmlApplicationContext("ex1_xml1/applicationContext.xml");
	
	//넘어오는 것 받기
//	MessageBean bean = context.getBean("bean",MessageBean.class);
//	bean.sayHello("홍길자");
	MessageBean bean = (MessageBean)context.getBean("ko");
	bean.sayHello("HONG");
	MessageBean bean2 = (MessageBean)context.getBean("en");
	bean2.sayHello("HONG2");
	MessageBean bean3 = (MessageBean)context.getBean("en");
	bean2.sayHello("HONG3");
	}

}
