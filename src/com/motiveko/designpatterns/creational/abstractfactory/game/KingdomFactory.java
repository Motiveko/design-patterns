package com.motiveko.designpatterns.creational.abstractfactory.game;

public interface KingdomFactory {
	public Army createArmy();
	public Castle createCastle();
	public King createKing();
}
