package com.motiveko.designpatterns.structural.adapter.mediaplayer;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equals("vlc")) advancedMusicPlayer = new VlcPlayer();
		else if(audioType.equals("mp4")) advancedMusicPlayer = new Mp4Player();
	}
	
	@Override
	public void play(String audioType, String fileName) {
	      if(audioType.equalsIgnoreCase("vlc")){
	          advancedMusicPlayer.playVlc(fileName);
	       }
	       else if(audioType.equalsIgnoreCase("mp4")){
	          advancedMusicPlayer.playMp4(fileName);
	       }		
	}

}
