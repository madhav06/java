package com.inheritance;

public class Subject {
	
	int min = 12;
	
}

class Student extends Subject {
	
	int theory = 46;
	
	int max = 80;
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println("maximum marks obtained : " +s.max);
		System.out.println("Practical marks :" +s.min);
		System.out.println("Theory marks : " +s.theory);
	}
}
	
	
	


