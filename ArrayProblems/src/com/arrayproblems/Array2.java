package com.arrayproblems;

public class Array2 {
	
	String s1 = "Madhav";
	
	String s2 = "Nandan";
	
	int n = s1.length() + s2.length();
	
	String[] addString(String s1, String s2){
		
		String[] str = new String[n];
		
		for(int i = 0; i < s1.length();i++){
				str[i] = s1.charAt(i);
			
		}
		for(int j = 0; j < n; j++){
			
			str[j] = s2.charAt(j+s1.length());
		}
		
		return str;
	}
			

}
