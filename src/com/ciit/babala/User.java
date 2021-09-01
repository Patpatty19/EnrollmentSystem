package com.ciit.babala;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {
	
	protected String name;
	protected String birthDate;
	protected String createDate;
	
	protected InputStreamReader input = new InputStreamReader(System.in);
	protected BufferedReader reader = new BufferedReader(input);
	
	public User () {
		name = null;
		birthDate  = null;
		createDate = null;
		

}
	public void showName (String name) {
		this.name = name;
	}
	
	public void showBirthdate (String birthDate) {
		this.birthDate = birthDate;
	}
	
	public void showCreatedate (String createDate) {
		this.createDate = createDate;
	}
}
