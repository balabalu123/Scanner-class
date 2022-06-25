package org.scanner;

import java.util.Scanner;

public class Employee {

	
	public  void Emp() {
		
		System.out.println("Emp salary is: 1000");

	}
	public void Salary() {
	System.out.println("Salary is 20000");

	}
	

	public static void main(String[] args) {
		
	
	Scanner f = new Scanner(System.in);
	
	System.out.println("Enter Employee Id details");
    int empid  = f.nextInt();
	System.out.println("int empid: "+empid);
	
	
	System.out.println("Enter Employee name");
	String empname = f.next();
	System.out.println("String empname: "+empname);
	
	System.out.println("Enter employee email id");
	String empemail = f.next();
	System.out.println("String empemail: "+empemail);
	
	
	System.out.println("Enter employee phone number");
	long phone = f.nextLong();
	System.out.println("long phone: "+phone);
	
	System.out.println("Enter employee salary");
	short Salary = f.nextShort();
	System.out.println("sghort salary: "+Salary);
	
	
	System.out.println("enter employee gender");
	String gender = f.next();
	System.out.println("String gender: "+gender);
	
	System.out.println("enter employee city");
	String city = f.next();
	System.out.println("String city: "+city);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
