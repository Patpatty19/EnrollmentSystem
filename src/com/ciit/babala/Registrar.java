package com.ciit.babala;

import java.io.IOException;

public class Registrar extends User{
	
	private int registrarId;
	private String role;
	

	public void registrarInfo() throws IOException {
		
		char letter = ' ';
		
		System.out.println("Student Enrollment System "); 
		System.out.println ("What is your name? " );
		this.showName(reader.readLine());
		System.out.println ("When is your birthdate? ");
		this.showBirthdate(reader.readLine());
		System.out.println ("What is the date today? ");
		this.showCreatedate(reader.readLine());
		System.out.println ("This is your registrar Id! ");
		System.out.println (this.showRegistrarid());
		System.out.println ("What role are you enrolling for? ");
		System.out.println ("Select from the options below:");
		System.out.println ("c < cashier ");
		System.out.println ("r < records ");
		System.out.println ("m < manager");
		letter = reader.readLine().charAt(0);
		
		switch (letter) {
		
		case 'c':
			this.showRole("Cashier");
			System.out.println ("You chose cashier! ");
			break;
		
		
		
		case 'r':
			this.showRole("Records");
			System.out.println ("You chose records! ");
			
			break;
		
		
		
		case 'm':
			this.showRole("Manager");
			System.out.println ("You chose manager! ");
			
			break;
		}
		System.out.println ("You've successfully enrolled as a registrar!");
		
	}
	
	
	public Registrar() {
		registrarId = 569872;
		role = null;
		
	}
	
	public int showRegistrarid () {
		return registrarId;
	}
	
	public void showRole (String role) {
		this.role = role;
	}
	

}
