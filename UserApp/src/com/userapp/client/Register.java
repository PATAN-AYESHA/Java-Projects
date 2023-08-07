package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws NameExistsException, TooShortException, TooLongException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = scanner.next();
		ValidationServiceImpl validationservice = new ValidationServiceImpl();
		try {

		if(validationservice.validteUsername(username)) {
			System.out.println("Enter password:");
			String password= scanner.next();
			if(validationservice.validatePassword(password)) {
				System.out.println("Welcome user");
			}
			
		}
		}
		catch(NameExistsException|TooShortException|TooLongException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("-------");
		}
		scanner.close();
		
	}

}
