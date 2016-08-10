package com.chapterone;

//

public class MySecondApp {
	
	public static void main(String[] args) {
		
		int x = 05;
		while ( x > 3) {
			
			//loop code will run because
			// x is greater than 3
			
			x = x - 1;
			System.out.println("the number changes to: " + x);
			
		}
		int z = 27;
		
		while (z == 17) {
			
			//loop code will not run because
			// z is not equal to 17
			System.out.println("the number changes to: " + z);
		}
		    System.out.println("the number is: " + z);
		
	}

}
