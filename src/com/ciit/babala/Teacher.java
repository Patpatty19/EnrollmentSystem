package com.ciit.babala;

import java.io.IOException;

public class Teacher extends User{
	
	private int teacherId;
	private String department;
	


	public void teacherInfo() throws IOException {
		
		char letter = ' ';
		
		System.out.println("Student Enrollment System "); 
		System.out.println ("What is your name? " );
		this.showName(reader.readLine());
		System.out.println ("When is your birthdate? ");
		this.showBirthdate(reader.readLine());
		System.out.println ("What is the date today? ");
		this.showCreatedate(reader.readLine());
		System.out.println ("This is your teacher Id! ");
		System.out.println (this.showTeacherid());
		System.out.println ("What department are you enrolling for? ");
		System.out.println ("Select from the options below:");
		System.out.println ("c < core programs ");
		System.out.println ("s < specialization programs ");
		System.out.println ("g < general  education programs");
		letter = reader.readLine().charAt(0);
	
	
	
	switch (letter) {
	
	case 'c':
		
		this.showDepartment("Core programs");
		System.out.println ("You chose core programs! ");
		break;
	
	
	
	case 's':
		this.showDepartment("Specialization programs");
		System.out.println ("You chose specialization programs! ");
		
		break;
	
	
	
	case 'g':
		this.showDepartment("General education programs");
		System.out.println ("You chose general education programs! ");
		
		break;
	}
	System.out.println ("You've successfully enrolled as a teacher!");
	}
	
	public Teacher() {
		teacherId = 212775;
		department = null;
		
	}
	
	public int showTeacherid () {
		return teacherId;
	}
	
	public void showDepartment (String department) {
		this.department = department;
	}
	
}
