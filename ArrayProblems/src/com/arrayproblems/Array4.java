package com.arrayproblems;

public class Array4 {
	

	String s1 = "Keshav";
	String s2 = "nandan";
	String[] arrangeString(String s1, String s2){
		
		String[] str1 = new String[s1.length()+s2.length()];
		
		for(int i=0 ; i < 10; i+=2){Char str1[i] = s1.charAt(i);}
		
		for(int j = 0;j<=11; j+=2 ){str1[j]=s2.charAt(j);}
		
		return str1;
	}
	public static void main(String[] args) {
		
		System.out.println(" "+str1);
	}

}
