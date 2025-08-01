  package tm.shtashkynov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main (String[] args ) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");


		Computer computer1 = context.getBean("computer", Computer.class); 
		
		System.out.println( computer1 );
		context.close();
	}

}
