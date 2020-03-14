package com.designpatterns.factorymethod;

import java.util.*;

public class OrcBlacksmith implements Blacksmith {

	//orc류 weapon들을 이미 생성해놓은 상태로 map에 저장해놓고 manufature함수 호출시마다 꺼내주는형태.
	private static Map<WeaponType, OrcWeapon> ORCARSENAL;
	
	static {
		ORCARSENAL = new HashMap<>(WeaponType.values().length);
		Arrays.stream(WeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));	
	}
	
	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return ORCARSENAL.get(weaponType);
	}

	
}
