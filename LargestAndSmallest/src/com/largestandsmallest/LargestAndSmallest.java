package com.largestandsmallest;

import java.util.Arrays;

public class LargestAndSmallest {
	
	public static void main(String[] args) {
		
	
	
		int b[] = {2,3,1,0,5};
		Arrays.sort(b);
		System.out.println(" Largest no. is: "+b[b.length-1]);
		
		System.out.println("Smallest no. is: "+b[b.length-5]);
		    }
		}