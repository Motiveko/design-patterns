package com.motiveko.designpatterns.creational.builder.computer2;

public class Main {

	public static void main(String[] args) {
		ComputerBuilder builder = new ComputerBuilder();
		
		//Chaining을 통해 객체의 Build과정의 가독성을 높여 실수를 줄인다.
		Computer computer = builder
				.setCpu("i7")
				.setRam("8g")
				.setStorage("1TB SSD")
				.build();
		
		System.out.println(computer.toString());
		
	}
	
}
