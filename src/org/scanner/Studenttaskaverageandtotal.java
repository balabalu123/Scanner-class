package org.scanner;

import java.util.Scanner;

public class Studenttaskaverageandtotal {

	
	public static void main(String[] args) {
		
		int mark1,mark2,sum;
		
		Scanner g = new Scanner(System.in);
		
		
		
		System.out.println("Enter student name");
		String studentname = g.next();
		System.out.println("String name: "+studentname);
		
		
		System.out.println("Enter student id ");
		int studentid = g.nextInt();
		System.out.println("int studentid: "+studentid);
		
		
		
		
		System.out.println("enter total mark1");
		mark1=g.nextByte();
		System.out.println("byte mark1: "+mark1);
		
		System.out.println("enter total mark2");
		mark2 = g.nextByte();
		System.out.println("byte mark2: "+mark2);
		
		System.out.println("Average of two numbers is: "+(mark1+mark2)/2);
		
		
		System.out.println("sum of two numbers is: "+(mark1+mark2));
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
