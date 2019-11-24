package aop3_annotation;

import org.springframework.stereotype.Component;

@Component("targetBean")
public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		System.out.println("sayHello() 인가");
	}

	@Override
	public void engSayHello() {
		System.out.println("engSayHello?");
	}


}
