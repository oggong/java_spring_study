package ex1_xml4_list;

public class MemberBean {
	private String name;
	private int age;
	private String message;

	public MemberBean() {
	}

	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}
	//getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMessage() {
		return message;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void output() {
		System.out.println(name + "[" + age + "]" + message);

	}

}
