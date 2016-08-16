package com.miscellenous;

public class Program9 {
	
	static int i = 04;
	static int j = 8;
	static int k = 9;
	 static String l =  "Bihar";
	 static String s =  "ABC";
	 static int y = 10;
	 static int z = 20;
	 
	
	public static void main(String[] args) {
		
		
		System.out.println(i +" " +j + k + l);
		
	int p =	Integer.valueOf(String.valueOf(i)  + String.valueOf(j)+ String.valueOf(k));
	int x =	Integer.valueOf(String.valueOf(y)  + String.valueOf(z));
		System.out.println(p);
		System.out.println(p + " " + l+" " +  x + " " + s);
	}



}