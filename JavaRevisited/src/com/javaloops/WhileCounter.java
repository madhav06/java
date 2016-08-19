package com.javaloops;

public class WhileCounter {
	
	static int Counter = 10;
	
	static int factorial = 1;
	
	public static void main(String[] args) {
		
	//}
	
	while( Counter > 1){
		
		factorial = factorial*Counter;
		
		Counter--;
		
		System.out.println("Factorial is: "+factorial);
	}

}
}