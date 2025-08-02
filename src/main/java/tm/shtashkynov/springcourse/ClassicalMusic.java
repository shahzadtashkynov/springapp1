package tm.shtashkynov.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

	@Override 
	public String getSong() {
		return "Hungarian rapsody "; 
	}
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization for ClassicalMusic");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Destroying ClassicalMusic bean");
	}
	
}
