package com.motiveko.designpatterns.creational.prototype.game;

public class HeroFactoryImpl implements HeroFactory{

	
	private Mage mage;
	private Beast beast;
	private Warlord warlord;
	
	public HeroFactoryImpl (Mage mage, Beast beast, Warlord warlord) {
		this.mage = mage;
		this.beast = beast;
		this.warlord = warlord;
	}
	
	
	@Override
	public Mage createMage() {
		return mage.copy();
	}

	@Override
	public Beast createBeast() {
		return beast.copy();
	}

	@Override
	public Warlord createWarlord() {
		return warlord.copy();
	}

	
}
