package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validteUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		return IValidationService.super.validteUsername(username);
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
		return IValidationService.super.validatePassword(password);
	}

	

}
