package com.designpatterns.builder.fastfood;

public class Main {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("====Veg Meal====");
		vegMeal.showItems();
		
		System.out.println();
		System.out.println("====Veg Meal====");
		nonVegMeal.showItems();
		
	}
}
