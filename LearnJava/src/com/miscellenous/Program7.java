package com.miscellenous;

public class Program7 {
	
	static int i = 10;
	static int j = 20;
	static int k = 30;
	 static String l =  "ABC";
	
	public static void main(String[] args) {
		
		
		System.out.println(i + j + k + l);
		
	int p =	Integer.valueOf(String.valueOf(i)  + String.valueOf(j)+ String.valueOf(k));
		System.out.println(p);
		System.out.println(l + " " + p);
	}



}

