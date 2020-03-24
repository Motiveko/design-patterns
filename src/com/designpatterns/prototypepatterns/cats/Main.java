package com.designpatterns.prototypepatterns.cats;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat cat = new Cat();
		cat.setName("나비");
		cat.setAge(new Age(2013,7));
		
		Cat cat2 = cat.copy();
		cat2.setName("토끼");
		cat2.setAge(new Age(2015,5));
		
		System.out.println(cat.getName());
		System.out.println(cat.getAge().getBirth());
		System.out.println(cat.getAge().getOld());

		System.out.println(cat2.getName());
		System.out.println(cat2.getAge().getBirth());
		System.out.println(cat2.getAge().getOld());
	}
}
