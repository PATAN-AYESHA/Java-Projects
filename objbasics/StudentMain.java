package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("Patan Ayesha", "CSE");
		student.printDetails();
		String grade= student.getGrades(90,83,70,80,97,85);
		System.out.println("Grade:"+grade);
		
	}

}
