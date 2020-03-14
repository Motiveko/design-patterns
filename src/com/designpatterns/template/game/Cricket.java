package com.designpatterns.template.game;

public class Cricket extends Game{

	@Override
	public void initialize() {
		System.out.println("Cricket Game initialized! Start Game!");
	}

	@Override
	public void startPlay() {
		System.out.println("Cricket game started! Enjoy Game!");
	}

	@Override
	public void endPlay() {
		System.out.println("Cricket game ended! Finish Game!");
	}

}
