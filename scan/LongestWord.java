package com.lumen.scan;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = scanner.nextLine();
		String longestWord="";
		String word="";
		String words[]= new String[50];
		int wordslength=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)!=' ') {
				word+=sentence.charAt(i);
			}
			else {
				words[wordslength]=word;
				wordslength++;
				word="";
			}
		}
		String word1=words[0];
		for(int j=0;j<wordslength;j++) {
			if(word1.length() < words[j].length()) {
				word1=words[j];
			}
		}
		System.out.println("Longest word in given sentence is: "+ word1);
		scanner.close();
	}

}
