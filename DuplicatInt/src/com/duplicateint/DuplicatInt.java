package com.duplicateint;

import java.util.Arrays;


public class DuplicatInt {

public static void main(String[] args) {
	
	int[] b = { 5, 1, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
	Arrays.sort(b);

	for(int i = 1; i < b.length; i++) {
	    if(b[i] == b[i - 1]) {
	        System.out.println("Duplicate: " + b[i]);
	    }
	}
	

}
}
	



