package com.doctorapp.client;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor("suraj","neurologist",2000,13);
		IDoctorService doctorService=new DoctorServiceImpl();
		//doctorService.addDoctor(doctor);
		doctorService.updateDoctor(3, 9000.0);
		//doctorService.deleteDoctor(1);
		
	}

}
