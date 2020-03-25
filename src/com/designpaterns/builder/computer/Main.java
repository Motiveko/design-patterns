package com.designpaterns.builder.computer;

public class Main {

	public static void main(String[] args) {
		

		ComputerFactory factory = new ComputerFactory();
		
		factory.generate(new SonyBluePrint());
		Computer sonyCom = factory.getComputer();
		
		factory.generate(new MacBluePrint());
		Computer macCom = factory.getComputer();
		
		sonyCom.showInfo();
		macCom.showInfo();
		
	}
}
