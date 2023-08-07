package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Patan Ayesha", "Programmer");
		if(employee.designation.equalsIgnoreCase("Programmer")) {
			System.out.println("Bonus: "+ employee.calcBonus(564));
		}
		if(employee.designation.equalsIgnoreCase("Manager")) {
			System.out.println("Bonus: "+ employee.calcBonus(345, 456));
		}
		if(employee.designation.equalsIgnoreCase("Director")) {
			System.out.println("Bonus: "+ employee.calcBonus(200, 532, 320));
		}

	}

}
