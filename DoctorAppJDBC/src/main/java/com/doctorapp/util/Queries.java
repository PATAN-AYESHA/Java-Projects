package com.doctorapp.util;

public class Queries {
	public static final String CREATEQUERY=
	"create table doctor(doctorName varchar(20),doctorId integer primary key auto_increment,speciality varchar(30),"
			+"experience int,fees double)";
	public static final String INSERTQUERY=
	"insert into doctor(doctorName,speciality,experience,fees) values(?,?,?,?)";
	public static final String UPDATEQUERY=
	"update doctor set fees=? where doctorId=?";
	public static final String DELETEQUERY=
	"delete from doctor where doctorId=?";
	public static final String QUERYBYID=
	"select * from doctor where doctorId=?";
	public static final String QUERYBYSPECIALITY=
	"select * from doctor where speciality=?";
	public static final String QUERY=
	"select * from doctor";
}
