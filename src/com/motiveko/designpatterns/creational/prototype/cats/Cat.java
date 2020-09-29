package com.motiveko.designpatterns.creational.prototype.cats;

public class Cat implements Cloneable{

	private String name;
	private Age age;

	public Cat copy() throws CloneNotSupportedException {
		Cat cat = (Cat) this.clone();
		
		return cat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	
	
}
