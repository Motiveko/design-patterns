package com.motiveko.designpatterns.creational.factorymethod.wepons;

public enum WeaponType {

	SHORT_SWORD("short sowrd"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

	private String title;
	
	WeaponType(String title){
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
	
}
