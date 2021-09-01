package com.ciit.babala;

import java.io.IOException;

public class Student extends User {
	
	private int studentId;
	private String course;
	private int yearLevel;
	
	
	
	
	
	public void studentInfo() throws IOException {
		
		char letter = ' ';
		
		System.out.println("Student Enrollment System "); 
		System.out.println ("What is your name? " );
		this.showName(reader.readLine());
		System.out.println ("When is your birthdate? ");
		this.showBirthdate(reader.readLine());
		System.out.println ("What is the date today? ");
		this.showCreatedate(reader.readLine());
		System.out.println ("This is your student Id ");
		System.out.println (this.showStudentid());
		System.out.println ("What is your course? ");
		System.out.println ("Select from the options below:");
		System.out.println ("p < programming ");
		System.out.println ("a < animation ");
		System.out.println ("m < multimedia ");
		letter = reader.readLine().charAt(0);
		
		
	switch (letter) {
		
		case 'p':
			
			this.showCourse("Programming");

			System.out.println ("You chose programming! ");
			break;
		
		
		
		case 'a':
			this.showCourse("Animation");
			System.out.println ("You chose animation! ");
			
			break;
		
		
		
		case 'm':
			this.showCourse("Multimedia");
			System.out.println ("You chose multimedia! ");
			
			break;
		}
	System.out.println ("What year level are you enrolling for?  ");
    this.showYearlevel(Integer.parseInt(reader.readLine())); 
	System.out.println ("You've successfully enrolled as a student!");
		
	}
	
	
	public Student () {
		this.studentId =  308765;
		this.course = null;
		this.yearLevel = 0;
	}
	

	
	public int showStudentid () {
		return this.studentId;
	}
	
	public void showCourse (String course) {
		this.course = course;
	}
	public void showYearlevel (int yearLevel) {
		this.yearLevel = yearLevel;
	}


}
