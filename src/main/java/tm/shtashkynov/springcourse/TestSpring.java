  package tm.shtashkynov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main (String[] args ) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Music music1 = context.getBean("classicalMusic", Music.class ); 
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class) ;
		musicPlayer.setMusic(music1);
		
		musicPlayer.playMusic(); 
		
		
		
		context.close();
	}

}
