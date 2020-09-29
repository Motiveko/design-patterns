package com.motiveko.designpatterns.creational.prototype.game;

public interface HeroFactory {

	Mage createMage();
	
	Beast createBeast();
	
	Warlord createWarlord();
	
}
