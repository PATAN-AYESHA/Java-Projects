package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {

	String[] localities = {"Andhra Pradesh","Uttar Pradesh","Madhya Pradesh","Telangana","Tamil Nadu"};
	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException,LocalityNotFoundException,NoVoterIDException,UnderAgeException {
		try {
			if(checkAge(age))
				if(checkLocality(locality))
					if(checkVoterId(voterId))
						return true;
		}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
		throw new InValidVoterException();
	}
	
	public boolean checkAge(int age) throws UnderAgeException{
		if(age<18) {
			throw new UnderAgeException("You are below 18 years.");
		}
		return true;
	}
	
	public boolean checkLocality(String locality) throws LocalityNotFoundException{
		for(String location: localities) {
			if(location.equalsIgnoreCase(locality))
				return true;
		}
		throw new LocalityNotFoundException();
	}
	
	public boolean checkVoterId(int voterId) throws NoVoterIDException{
		if(voterId>= 1000 && voterId<=9999)
			return true;
		throw new NoVoterIDException("Invalid voterId.");
	}
	
}
