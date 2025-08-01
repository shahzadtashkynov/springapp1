package tm.shtashkynov.springcourse;

public class ClassicalMusic implements Music {
	private ClassicalMusic () {}; 
	
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
	
	
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
