package com.motiveko.designpatterns.structural.adapter.mediaplayer;

/* Boat 예제보다 훨씬 더 좋은 예제이다. 
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 * 여기서 만약 avi 재생기능도 추가하고싶다면 avi재생 기능을 담은 객체를 만들고 그걸 
 * Adapter에 추가해주면 될 듯 하다.
 */
public class Main {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
	    audioPlayer.play("mp3", "beyond the horizon.mp3");
	    audioPlayer.play("mp4", "alone.mp4");
	    audioPlayer.play("vlc", "far far away.vlc");
	    audioPlayer.play("avi", "mind me.avi");
	}
}
