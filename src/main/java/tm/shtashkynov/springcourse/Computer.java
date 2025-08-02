package tm.shtashkynov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	private MusicPlayer musicPlayer ; 
	
	public Computer(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer ; 
	};
	
	@Override
	public String toString() {
		return "Computer "+ musicPlayer.getName() +" "
	+ musicPlayer.playMusic() + " and Volume is =  " + musicPlayer.getVolume(); 
	}
}
