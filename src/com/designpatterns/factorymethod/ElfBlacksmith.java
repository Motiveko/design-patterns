package com.designpatterns.factorymethod;

import java.util.*;

public class ElfBlacksmith implements Blacksmith {

	
	private static Map<WeaponType, ElfWeapon> ELFARSENAL;
	
	static {
		ELFARSENAL = new HashMap<>(WeaponType.values().length);
		Arrays.stream(WeaponType.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
		
	}
	
	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return ELFARSENAL.get(weaponType);
	}

	
}
