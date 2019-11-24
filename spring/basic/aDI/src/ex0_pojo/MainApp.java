package ex0_pojo;

public class MainApp {

	public static void main(String[] args) {
		
		//MessageBeanEnImpl bean = new MessageBeanEnImpl();
		MessageBean bean = new MessageBeanKoImpl();
		bean.sayHello("홍");
		
	}

}
