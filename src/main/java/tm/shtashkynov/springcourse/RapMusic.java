package tm.shtashkynov.springcourse;

public class RapMusic implements Music {

	@Override
	public String getSong() {
		return "Eminem Lose YourSelf";
	}
	
	public void init() {
		System.out.println("Doing my initialization for this bean ");
		}
}
