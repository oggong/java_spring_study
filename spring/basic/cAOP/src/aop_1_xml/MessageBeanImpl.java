package aop_1_xml;

public class MessageBeanImpl implements MessageBean {

	@Override
	public void sayHello() {
		System.out.println("sayHello() 인가");
	}

	@Override
	public void engSayHello() {
		System.out.println("engSayHello?");
	}

	@Override
	public void test() {
		System.out.println("test");
	}

}
