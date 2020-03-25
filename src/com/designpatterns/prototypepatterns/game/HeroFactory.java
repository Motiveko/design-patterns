package com.designpatterns.prototypepatterns.game;

public interface HeroFactory {

	Mage createMage();
	
	Beast createBeast();
	
	Warlord createWarlord();
	
}
