package com.ciit.babala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		char letter = ' ';
		
		System.out.println("Welcome to the Enrollment System"); 
		System.out.println ("Please select an option below: ");
		System.out.println ("s > Student ");
		System.out.println ("t > Teacher ");
		System.out.println ("r > Registar ");
		letter = reader.readLine().charAt(0);
		
		switch (letter) {
		
		case 's':

			Student student = new Student();
			student.studentInfo();
			
			break;
		
		
		
		case 't':

			Teacher teacher = new Teacher();
			teacher.teacherInfo();
			
			break;
		
		
		
		case 'r':

			Registrar registrar = new Registrar();
			registrar.registrarInfo();
			
			break;
		}
		
		
		
		

	}

}
