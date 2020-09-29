package com.motiveko.designpatterns.behavioral.templatemethod.game;

public class Football extends Game{

	@Override
	public void initialize() {
		System.out.println("Football game initialized! Start Game!");
	}

	@Override
	public void startPlay() {
		System.out.println("Football game started! Enjoy Game!");
		
	}

	@Override
	public void endPlay() {
		System.out.println("Football game ended! finish Game!");
		
	}

}
