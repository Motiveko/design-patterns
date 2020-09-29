package com.motiveko.designpatterns.creational.abstractfactory.game;

public class Main   {

	public enum KingdomType{ ELF, ORC }
	
	public static class FactoryMaker{
	
		public static KingdomFactory createFactory(KingdomType kingdomType) {
			switch(kingdomType) {
	
			case ELF:
				return new ElfKingdomFactory();
			case ORC:
				return new OrcKingdomFactory();
			default:
				return null;
	
			}
		}
	}
	
	public static void main(String[] args) {
		
		KingdomFactory factory = FactoryMaker.createFactory(KingdomType.ELF);
		
		Army army = factory.createArmy();
		Castle castle = factory.createCastle();
		King king = factory.createKing();
		
		System.out.println(
				"ARMY : " + army.getDescription() 
				+ ", CASTLE : " + castle.getDescription()
				+ ", KING : " + king.getDescription());
		
		factory = FactoryMaker.createFactory(KingdomType.ORC);
		
		army = factory.createArmy();
		castle = factory.createCastle();
		king = factory.createKing();
		
		System.out.println(
				"ARMY : " + army.getDescription() 
				+ ", CASTLE : " + castle.getDescription()
				+ ", KING : " + king.getDescription());
	}
}
