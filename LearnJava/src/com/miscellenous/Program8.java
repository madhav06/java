package com.miscellenous;

public class Program8 {
	
	static int i = 10;
	static int j = 34;
	static int k = 24;
	 static String l =  "Bihar";
	 static String s =  "State";
	
	public static void main(String[] args) {
		
		
		System.out.println(i + j + k + l);
		
	int p =	Integer.valueOf(String.valueOf(i)  + String.valueOf(j)+ String.valueOf(k));
		System.out.println(p);
		System.out.println(l + " " + p +" " + s);
	}



}
