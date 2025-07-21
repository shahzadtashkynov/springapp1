  package tm.shtashkynov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main (String[] args ) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
		
		MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); 
		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		boolean cmp = firstmusicPlayer == secondMusicPlayer ;
		
		System.out.println(cmp);

		System.out.println(firstmusicPlayer); 
		System.out.println(secondMusicPlayer); 
		
		firstmusicPlayer.setVolume(45);
		
		System.out.println(firstmusicPlayer.getVolume()); 
		System.out.println(secondMusicPlayer.getVolume()); 
		
		context.close();
	}

}
