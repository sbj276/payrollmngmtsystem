package com.payrollsystem.payrollMgtsys.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Employee_Id;
	
	public String First_Name;
	public String Last_Name;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	public Date Hire_Date;
	public String City;
	public String State;
	
	public Employee() {}
	
	public Employee(int employee_Id, String first_Name, String last_Name, Date hire_Date, String city, String state) {
		super();
		Employee_Id = employee_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Hire_Date = hire_Date;
		City = city;
		State = state;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public Date getHire_Date() {
		return Hire_Date;
	}

	public void setHire_Date(Date hire_Date) {
		Hire_Date = hire_Date;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	
	
	
}
