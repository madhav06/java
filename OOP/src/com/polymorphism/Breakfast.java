package com.polymorphism;

public class Breakfast {
	
	void eat() {
		
		System.out.println("Let's eat Breakfast - 3 Eggs , 1- Bottle Milk , 1 Bread ");
	}

}

class Meal extends Breakfast {
	void eat() {
		System.out.println(" Enough! time lapsed , let's eat meal now...");

}
	public static void main(String[] args) {
		
		Breakfast b = new Meal();
		
		b.eat();
	}
}
