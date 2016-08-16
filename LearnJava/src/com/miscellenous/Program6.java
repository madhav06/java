package com.miscellenous;

public class Program6 {
	
	static int i = 10;
	static int j = 24;
	static int k = 23;
	 static String l =  "Darbhanga";
	
	public static void main(String[] args) {
		
		
		System.out.println(i + j + k + l);
		
	int p =	Integer.valueOf(String.valueOf(i)  + String.valueOf(j)+ String.valueOf(k));
		System.out.println(p);
		System.out.println(p + " " + l);
	}



}
