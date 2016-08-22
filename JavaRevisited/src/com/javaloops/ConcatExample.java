package com.javaloops;

public class ConcatExample {

//}


//public class ConcatExample{  
public static void main(String args[]){  
String s1="keshav";  
s1.concat("nandan");  
System.out.println(s1);  
s1=s1.concat("nandan")+ s1.substring(3);  
System.out.print(s1);  

char[] ch = s1.toCharArray();
for(int i = 0; i < ch.length; i++){
	if(i==0){break;}
	System.out.print(ch[i]);
}
}}  