package com.motiveko.designpatterns.behavioral.templatemethod.game;

public abstract class Game {

	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	//Template Method
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
