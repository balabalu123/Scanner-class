package org.scanner;

import java.util.Scanner;

public class Staff {

	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		
		
		System.out.println("enter java details");
		String java = a.nextLine();
		System.out.println("String java: "+java);
		
		
		System.out.println("Enter your Name");
		String name = a.next();
		System.out.println("String name: "+name);
		
		System.out.println("Enter your age");
		byte age = a.nextByte();
		System.out.println("byte age: "+age);
		
		System.out.println("Enter your account number");
		int accountnumber = a.nextInt();
		System.out.println("int accountnumber: "+accountnumber);
		
		System.out.println("Enter your phonenumber");
		long phonenumber = a.nextLong();
		System.out.println("long phonenumber: "+phonenumber);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
