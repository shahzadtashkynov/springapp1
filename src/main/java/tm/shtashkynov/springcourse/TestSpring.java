  package tm.shtashkynov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main (String[] args ) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
		System.out.println(classicalMusic.getSong());
		
		ClassicalMusic newClassicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class); 
		System.out.println(newClassicalMusic.getSong()); 
		
		
//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
		
//		MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); 
//		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		
//		boolean cmp = firstmusicPlayer == secondMusicPlayer ;
//		
//		System.out.println(cmp); 
//
//		System.out.println(firstmusicPlayer); 
//		System.out.println(secondMusicPlayer); 
//		
//		firstmusicPlayer.setVolume(45);
//		
//		// console outputs was  been removed 
		
		context.close();
	}

}
