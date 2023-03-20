package com.miniproject;

import java.util.Scanner;

public class MainClass extends DesignQuiz  {
	public static void userInput() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter firstname:");
		String firstname=sc.next();
		System.out.println("Enter lastname:");
		String lastname=sc.next();
		System.out.println("Enter userame:");
		String username=sc.next();
		System.out.println("Enter city:");
		String city=sc.next();
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter password:");
		int password=sc.nextInt();
		System.out.println("Enter mobileNumber:");
		long mobileNumber=sc.nextLong();
		
		DesignQuiz dq=new DesignQuiz();
		dq.setFirstname(firstname);
		dq.setLastname(lastname);
		dq.setUsername(username);
		dq.setCity(city);
		dq.setEmail(email);
		dq.setPassword(password);
		dq.setMobileNumber(mobileNumber);
		
		System.out.println("Student firstName is: "+dq.getFirstname());
		System.out.println("Student lastName is: "+dq.getLastname());
		System.out.println("Student userName is: "+dq.getUsername());
		System.out.println("Student city is: "+dq.getCity());
		System.out.println("Student Email is: "+dq.getEmail());
		System.out.println("Student Password is: "+dq.getPassword());
		System.out.println("Student mobileNumber is: "+dq.getMobileNumber());
		
		
		
	}
	public static void main(String[] args) {
		userInput();
		
		
	}

}
