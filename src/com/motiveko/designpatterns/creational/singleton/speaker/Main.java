package com.motiveko.designpatterns.creational.singleton.speaker;

public class Main {

	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		System.out.println(speaker1.toString());
		System.out.println(speaker2.toString());
	}

}
