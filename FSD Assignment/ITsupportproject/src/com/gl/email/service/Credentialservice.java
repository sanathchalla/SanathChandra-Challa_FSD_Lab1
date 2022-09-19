package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class Credentialservice {

	public char[] generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaps = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String special = "!@$%^&*()-=.,_+/?";
		String bigString = caps+lowercaps+number+special;
		Random random = new Random();
		char [] password = new char[8];
		for (int i=0;i<8;i++ ) {
			password[i]= bigString.charAt(random.nextInt(bigString.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String Department) {
		return firstName+lastName+"@"+Department+"gl.com";
		
	}
	public void showCredentials(Employee emp,String email,char[] password) {
		System.out.println("Greetings!"+" "+emp.getFirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email:-->"+email);
		System.out.println("Password:-->"+password);
	}
	
	
}
