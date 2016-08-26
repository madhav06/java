package com.javaloops;

import java.util.Scanner;

public class Exception {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Input 1st integer: ");
			int n1 = input.nextInt();
			
			System.out.println("Input 2nd integer: ");
			int n2 = input.nextInt();
			
			int sum = n1/n2;
			System.out.println(sum);
		}
		catch(Exception e){
			
			System.out.println("You can't do that!");
		}
	}
}
