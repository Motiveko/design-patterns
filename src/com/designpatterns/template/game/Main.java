package com.designpatterns.template.game;

public class Main {

	public static void main(String[] args) {
		Game cricketGame = new Cricket();
		cricketGame.play();
		
		System.out.println();
		
		Game footballGame = new Football();
		footballGame.play();
		
		
	}
}
