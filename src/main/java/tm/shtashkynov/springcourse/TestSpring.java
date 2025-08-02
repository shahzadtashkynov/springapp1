  package tm.shtashkynov.springcourse;

  import org.springframework.context.annotation.AnnotationConfigApplicationContext;
  
public class TestSpring {
	public static void main (String[] args ) {
		AnnotationConfigApplicationContext  context = 
				new AnnotationConfigApplicationContext( SpringConfig.class);

		Computer computer1 = context.getBean("computer", Computer.class); 
		System.out.println( computer1 );
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println( musicPlayer.getName() ); 
		System.out.println( musicPlayer.getVolume() );
		
		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

		System.out.println(classicalMusic.getSong());
		
		context.close();
	}

}
