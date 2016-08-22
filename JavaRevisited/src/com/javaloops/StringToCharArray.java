package com.javaloops;

public class StringToCharArray {
	
	public static void main(String[] args) {
		
		String s1 = "keshav";
		char[] ch = s1.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(i==3){break;}
			System.out.print(ch[i]);
		}
		//
		String s2 = "nandan";
		char[] ch2 = s2.toCharArray();
		for(int i = 0; i < ch2.length; i++){
			//if(i==3){break;}
			System.out.print(ch2[i]);
		}
		//
		String s3 = s1.substring(3);
		char[] ch3 = s3.toCharArray();
		//for(int i = 0; i < ch3.length; i++){
			//if(i==3){break;}
			System.out.print(s1.substring(3));
			//System.out.print(ch3[]);
			
			
		}
	}



