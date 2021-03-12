package main;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String departament;
	private Scanner in = new Scanner(System.in);
	
	public Email() {
		System.out.println("Please enter your first name:");
		this.firstName = setName();
		System.out.println("Please enter your last name:");
		this.lastName = setName();
		System.out.println("Please choose your departament:\n1.Sales\n2.Development\n3.Accounting");
		this.departament = setDepartament();
		this.password = setPassword();
		System.out.println("Your email is: " + this.firstName + "."
		+ this.lastName + "@" + this.departament + "company.com\nYour Password is: " + this.password);
		
	}
	
	private String setName() {
		String result;
		result = in.nextLine();
		return result;
	}
	
	private String setDepartament() {
		String result = "";
		int check = in.nextInt();
		if (check == 1) { result = "sales."; }
		else if (check == 2) { result = "development."; }
		else if (check == 3) { result = "accounting."; }
		return result;
	}
	
	private String setPassword() {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$&#";
		int length = 10;
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			password[i] = passwordSet.charAt((int)(Math.random() * length));
		}
		return new String(password);
	}
	
	public String changePassword() {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$&#";
		int length = 10;
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			password[i] = passwordSet.charAt((int)(Math.random() * length));
		}
		this.password = new String(password);
		return new String(password);
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getDepartament() {
		return this.departament;
	}
	
	public String getPassword() {
		return this.password;
	}
}
