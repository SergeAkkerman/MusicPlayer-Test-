package en.serge.springcourse;

public class MusicPlayer {
	Music music;
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Now playing: " + music.getSong());
	}
}
