package com.designpatterns.prototypepatterns.game;

public class Main {

	public static void main(String[] args) {
		
		HeroFactoryImpl elfFactory = new HeroFactoryImpl(
				new ElfMage("힐"),
				new ElfBeast("포효"),
				new ElfWarlord("공격력증가"));
		
		HeroFactoryImpl orcFactory = new HeroFactoryImpl(
				new OrcMage("메테오"),
				new OrcBeast("할퀴기"),
				new OrcWarlord("때리기"));
		
		ElfMage elfMage1 = (ElfMage) elfFactory.createMage();
		ElfBeast elfBeast1 = (ElfBeast) elfFactory.createBeast();
		ElfWarlord elfWarlord1 = (ElfWarlord) elfFactory.createWarlord();
		
		OrcMage orcMage1 = (OrcMage) orcFactory.createMage();
		OrcBeast orcBeast1 = (OrcBeast) orcFactory.createBeast();
		OrcWarlord orcWarlord1 = (OrcWarlord) orcFactory.createWarlord();
		
		System.out.println(elfMage1.toString());
		
		ElfMage elfMage2 = elfMage1.copy();
		System.out.println(elfMage2.equals(elfMage1));
	}
}
