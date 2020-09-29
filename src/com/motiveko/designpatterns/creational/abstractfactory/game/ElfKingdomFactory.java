package com.motiveko.designpatterns.creational.abstractfactory.game;

public class ElfKingdomFactory implements KingdomFactory{

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	
}
