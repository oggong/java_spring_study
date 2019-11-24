package ex3_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext(
					"ex3_autowired/applicationContext.xml");
		
		// applicationContext.xml 파일에  값을 message 로 하겠다.
		
		MessageBean bean = ctx.getBean("message",MessageBean.class);
		bean.sayHello();
	}

}

