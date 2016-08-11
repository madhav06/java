package com.decimaltohexadecimal;

//public class DecimalToHexadecimal {

//}


 
 
 import java.util.Scanner;
 
 public class DecimalToHexadecimal {
	 
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a decimal number - ");
		
		int decimal = scanner.nextInt();
		
		String hexadecimal = " ";
				while(decimal!= 0) {
					int hexValue = decimal % 16;
					char hexChar;
					
					if (hexValue <= 9 && hexValue >= 0){
						hexChar = (char)(hexValue + '0');
					}
					else {
						hexChar = (char)(hexValue-10 + 'A');
					}
					hexadecimal = hexChar + hexadecimal;
					decimal = decimal / 16;
				}
				
				System.out.println("The hexadecimal number is " + hexadecimal);
	 }
 }
	
	 
 
