package com.payrollsystem.payrollMgtsys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int education_id;
	
	public int employee_id;
	public int graduation_year;
	public String degree;
	public int getEducation_id() {
		return education_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public int getGraduation_year() {
		return graduation_year;
	}
	public String getDegree() {
		return degree;
	}
	public Education(int education_id, int employee_id, int graduation_year, String degree) {
		super();
		this.education_id = education_id;
		this.employee_id = employee_id;
		this.graduation_year = graduation_year;
		this.degree = degree;
	}
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
