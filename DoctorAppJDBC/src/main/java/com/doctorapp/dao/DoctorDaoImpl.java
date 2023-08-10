package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DBConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDoa{

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		try(Connection connection = DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
			statement.setString(1, doctor.getDoctorName());
			//statement.setInt(2, doctor.getDoctorId());
			statement.setString(2, doctor.getSpeciality());
			statement.setDouble(4,doctor.getFees());
			statement.setInt(3, doctor.getExperience());
			statement.execute();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		int count=0;
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setDouble(1, fees);
			statement.setInt(2, doctorId);
			statement.execute();
			count=1;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		Doctor doctor=new Doctor();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);
				ResultSet rs=statement.executeQuery()){
			statement.setInt(1, doctorId);
			while(rs.next()) {
				String name=rs.getString("doctorName");
				String speciality=rs.getString("speciality");
				double fees=rs.getDouble("fees");
				int experience=rs.getInt("experience");
				Doctor doctor1=new Doctor(name,speciality,fees,experience);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setInt(1, doctorId);
			statement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Doctor> findAllDoctors() {
		// TODO Auto-generated method stub
		List<Doctor> listofDoctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERY);
				ResultSet rs=statement.executeQuery()){
			while(rs.next()) {
				String name=rs.getString("doctorName");
				String speciality=rs.getString("speciality");
				double fees=rs.getDouble("fees");
				int experience=rs.getInt("experience");
				Doctor doctor=new Doctor(name,speciality,fees,experience);
				listofDoctors.add(doctor);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listofDoctors;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> listofDoctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITY);
				ResultSet rs=statement.executeQuery()){
				statement.setString(1, speciality);
				statement.execute();
				ResultSet rs1=statement.executeQuery();
				while(rs.next()) {
					String name=rs1.getString("doctorName");
					String speciality1=rs1.getString("speciality");
					double fees=rs1.getDouble("fees");
					int experience=rs1.getInt("experience");
					Doctor doctor=new Doctor(name,speciality1,fees,experience);
					listofDoctors.add(doctor);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listofDoctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> listofDoctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITY);
				ResultSet rs=statement.executeQuery()){
				statement.setString(1, speciality);
				statement.setInt(2, experience);
				statement.execute();
				ResultSet rs1=statement.executeQuery();
				while(rs1.next()) {
					String name=rs1.getString("doctorName");
					String speciality1=rs1.getString("speciality");
					double fees=rs1.getDouble("fees");
					int experience1=rs1.getInt("experience");
					Doctor doctor=new Doctor(name,speciality1,fees,experience1);
					listofDoctors.add(doctor);
				}
				}catch(SQLException e) {
					e.printStackTrace();
				}
		return listofDoctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> listofDoctors=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITY);
				ResultSet rs=statement.executeQuery()){
				statement.setString(1, speciality);
				statement.setDouble(2, fees);
				statement.execute();
				ResultSet rs1=statement.executeQuery();
				while(rs1.next()) {
					String name=rs1.getString("doctorName");
					String speciality1=rs1.getString("speciality");
					double fees1=rs1.getDouble("fees");
					int experience1=rs1.getInt("experience");
					Doctor doctor=new Doctor(name,speciality1,fees1,experience1);
					listofDoctors.add(doctor);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
