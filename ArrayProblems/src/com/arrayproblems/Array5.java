package com.arrayproblems;

public class Array5 {
	
	String s1 = "Keshav";
	String s2 = "nandan";
	String[] arrangeString(String s1, String s2){
		
		String[] str1 = new String[s1.length()+s2.length()];
		
		str1[0] = s1.charAt(0);
		str1[1] = s1.charAt(1);
		str1[2] = s2.charAt(2);
		str1[3] = s2.charAt(3);
		str1[4] = s1.charAt(4);
		
		str1[5] = s1.charAt(5);
		str1[6] = s2.charAt(6);
		str1[7] = s2.charAt(7);
		str1[8] = s1.charAt(8);
		str1[9] = s1.charAt(9);
		str1[10] = s2.charAt(0);
		str1[11] = s2.charAt(0);
		
		return str1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("print : "+str);
	}

}
