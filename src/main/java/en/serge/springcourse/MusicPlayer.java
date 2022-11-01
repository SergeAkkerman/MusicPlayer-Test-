package en.serge.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	private List<Music> musicList = new ArrayList<>();
	
	public MusicPlayer() {}
	
	public MusicPlayer(List<Music>  musicList) {
		this.musicList = musicList;
	}
	
	public void setSong(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void playMusic() {
		System.out.println(musicList);
	}
}
