package com.designpatterns.singleton.speaker;

public class SystemSpeaker {

	private static SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() {
		this.setVolume(5);
	}
	
	public static SystemSpeaker getInstance() {
		if( instance == null) {
			instance = new SystemSpeaker();
			System.out.println("Create Initial Instance");
		} else System.out.println("Returns Precreated Instance");
		
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
