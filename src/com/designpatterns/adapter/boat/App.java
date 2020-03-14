package com.designpatterns.adapter.boat;

public class App {

	public static void main(String[] args) {
		Captain captin = new Captain(new FishingBoatAdapter());
		captin.row();
	}
}
