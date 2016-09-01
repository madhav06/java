package com.arrayproblems;

//public class ArraySort {

//}



import java.util.Arrays;

public class ArraySort {
	public static void main(String args[]) {
		int marks[] = { 98, 95, 91, 93, 97 };
		System.out.println("Before sorting: " + Arrays.toString(marks));
		Arrays.sort(marks);
		System.out.println("After sorting: " + Arrays.toString(marks));
	}
}
//Before sorting: [98, 95, 91, 93, 97]
//After sorting: [91, 93, 95, 97, 98]
