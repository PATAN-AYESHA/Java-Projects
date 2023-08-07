package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ElectionBoothImpl electionBoothImpl = new ElectionBoothImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("Enter your Age:");
		int age= scanner.nextInt();
		System.out.println("Enter your Locality:");
		String locality = scanner.nextLine();
		System.out.println();
		System.out.println("Enter your VoterID:");
		int voterId = scanner.nextInt();
		IElectionBooth electionBoothImpl = new ElectionBoothImpl();
		try {
			if(electionBoothImpl.checkEligibility(age, locality, voterId)) {
				System.out.println("You are a valid voter");
			}
			
		} catch (InValidVoterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
