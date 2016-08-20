package com.arrayproblems;

public class Array8 {
	
	String s1 = "Keshav";
	String s2 = "nandan";
	String[] alignmentString(String s1, String s2){
		
		String[] str1 = new String[s1.length()+s2.length()];
		
		str1[0] = s1.charAt(0);
		str1[1] = s1.charAt(1);
		str1[2] = s1.charAt(2);
		
		str1[3] = s2.charAt(s2.length());
		str1[4] = s2.charAt(s2.length());
		str1[5] = s2.charAt(s2.length());
		str1[6] = s2.charAt(s2.length());
		str1[7] = s2.charAt(s2.length());
		str1[8] = s2.charAt(s2.length());
		
		str1[9] =  s1.charAt(3);
		str1[10] = s1.charAt(4);
		str1[11] = s1.charAt(5);
		
		return str1;

	}
	public static void main(String[] args) {
		
		System.out.println("printing: "+str1);
	}
}
