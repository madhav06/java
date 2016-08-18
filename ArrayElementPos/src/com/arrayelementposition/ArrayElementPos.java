package com.arrayelementposition;

import java.util.Arrays;

public class ArrayElementPos {
	
	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5,6};

		Arrays.asList(a).indexOf(4);
		
		System.out.println("Index of 4: "+Arrays.asList(a).indexOf(4));
		
		Arrays.asList(a).indexOf(6);
		
		System.out.println("Index of 6: "+Arrays.asList(a).indexOf(6));
		
		Arrays.asList(a).indexOf(2);
		
		System.out.println("Index of 2: "+Arrays.asList(a).indexOf(2));
		
	}

}
