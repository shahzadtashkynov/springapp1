  package tm.shtashkynov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main (String[] args ) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

//		Computer computer1 = context.getBean("computer", Computer.class); 
//		System.out.println( computer1 );
		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		System.out.println( musicPlayer.getName() ); 
//		System.out.println( musicPlayer.getVolume() );
		
		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
		ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
		
		System.out.println(classicalMusic == classicalMusic2); // true, singleton scope
		
		
		context.close();
	}

}
