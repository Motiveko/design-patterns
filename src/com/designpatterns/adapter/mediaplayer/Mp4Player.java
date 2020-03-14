package com.designpatterns.adapter.mediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		return;
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name : " + fileName);
	}

}
