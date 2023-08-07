package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IValidationService {

	default boolean validteUsername(String username) throws NameExistsException{
		String[] usernames= {"Ayesha","Nasarbi","Neelofor"};
		for(String userName: usernames) {
			if(userName.equals(username)) {
				throw new NameExistsException("Name is already exist!");
			}
		}
		return true;
	}
	
	default boolean validatePassword(String password) throws TooShortException, TooLongException{
		if(password.length()<6) {
			throw new TooShortException("Your password is less than 6 characters...");
		}
		if(password.length()>15) {
			throw new TooLongException("Your password is greater than 15 characters...");
		}
		return true;
	}
}
