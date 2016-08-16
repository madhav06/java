package com.inheritance;

public class Vehicle {
	
	String type = "Petrol";
	String chessis = "Sedan";

}

class Car extends Vehicle {
	
	String name = "AMG-Series : AMG-45";
	String brand = "Mercedes-Benz";
	
	public static void main(String[] args) {
		
		
		Car c = new Car();
		
		System.out.println("Model Name : " +c.name);
		
		System.out.println("Brand Name : " +c.brand);
		
		System.out.println("Vehicle Type configuration : " +c.type);
		
		System.out.println("Chessis Built-in Design : " +c.chessis);
	}
}

 
