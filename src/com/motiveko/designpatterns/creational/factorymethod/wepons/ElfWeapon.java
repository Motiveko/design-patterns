package com.motiveko.designpatterns.creational.factorymethod.wepons;

public class ElfWeapon implements Weapon{

	private WeaponType weaponType;
	
	public ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}
	
	@Override
	public String toString() {
		return "Elfish" + weaponType;
	}
	
	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}

}
