package com.copyarray;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] a = {2 , 3 , 4 , 5, 8 , 9};
		
		int[] b = new int[6];
		
		for (int i=0; i<a.length; i++){
		System.out.println("Array old: "+a[i]);
		
		
		for(int j=0; j<a.length; j++){
		b[j] = a[i];
				
		System.out.println("Array new : "+b[j]);
		}
		
		
		}
	}
}

