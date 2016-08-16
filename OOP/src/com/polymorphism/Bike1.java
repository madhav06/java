package com.polymorphism;

//public class Bike1 {

//}


public class Bike1{  
	  void run(){System.out.println("running");}  
	}  
	class Splender extends Bike1{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String[] args){  
	    Bike1 b = new Splender();  
	    b.run();  
	  }  
	}  