package tm.shtashkynov.springcourse;


public class MusicPlayer {
	private Music music;
	private String name; 
	private double volume;
	
	/**
	 * Constructor with parameters
	 * @param music
	 */
	public MusicPlayer (Music music) {
		this.music = music; 
	};
	
	/**
	 * Default constructor
	 */
	public MusicPlayer() {};
	
	/**
	 * @return the music
	 */
	public void setMusic(Music music) {
		this.music = music;
	}
	
	/**
	 * @return the music
	 */
	public void playMusic() {
		System.out.println("Playing " + music.getSong());
	}
	
	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}
	
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	/**
	 * @return the music
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
