package tm.shtashkynov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {

	private Music music1; 
	private Music music2;
	
	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music1,
			@Qualifier("rockMusic") Music music2) {
		this.music1 = music1; 
		this.music2 = music2;
	}
	
	public String playMusic() {
			return "Playing " + music1.getSong()+" and " + music2.getSong();
		}
	}
