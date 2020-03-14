package com.designpatterns.adapter.mediaplayer;

public class AudioPlayer implements MediaPlayer {

	MediaPlayer mediaPlayer;

	@Override
	public void play(String audioType, String fileName) {
		if( !audioType.equals("mp3") && !audioType.equals("vlc") && !audioType.equals("mp4")) 
			System.out.println("Invalid Media." + audioType + " format not supported");
		
		if(audioType.equals("mp3")) {
			System.out.println("playing mp3 file. Name : " + fileName);
		} else {
			mediaPlayer = new MediaAdapter(audioType);
			mediaPlayer.play(audioType, fileName);
		}
		
	}

}
