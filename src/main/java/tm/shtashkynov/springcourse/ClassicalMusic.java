package tm.shtashkynov.springcourse;

public class ClassicalMusic implements Music {
	
	public void doMyInit() {
		System.out.println("Doing my initialization for ClassicalMusic");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction for ClassicalMusic");
	}
	
	@Override 
	public String getSong() {
		return "Hungarian rapsody "; 
	}
	
}
