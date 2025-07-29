package tm.shtashkynov.springcourse;

public class Student {
	private String name;
	
	Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	public void init() {
		System.out.println("Student bean is going through init.");
	}
	public void destroy() {
		System.out.println("Student bean will be destroyed now.");
		System.out.println("Goodbye " + name + "!");
		System.out.println("Student bean has been destroyed.");
	};
}
