package com.designpatterns.factorymethod;

import java.util.*;

public class App {


	public static void main(String[] args) {
		
		Blacksmith orcBlacksmith = new OrcBlacksmith();
		Blacksmith elfBlacksmith = new ElfBlacksmith();

		List<Weapon> orcWeapons = new ArrayList<>();
		List<Weapon> elfWeapons = new ArrayList<>();

		Arrays.stream(WeaponType.values()).forEach(type  -> orcWeapons.add(orcBlacksmith.manufactureWeapon(type)));
		Arrays.stream(WeaponType.values()).forEach(type  -> elfWeapons.add(elfBlacksmith.manufactureWeapon(type)));
		
		
		System.out.println(orcWeapons.toString());
		System.out.println(elfWeapons.toString());
	}
}
