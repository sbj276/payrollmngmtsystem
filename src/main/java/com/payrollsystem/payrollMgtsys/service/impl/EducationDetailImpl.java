package com.payrollsystem.payrollMgtsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.repo.EducationDetailRepo;
import com.payrollsystem.payrollMgtsys.service.EducationDetailInterface;

@Component
public class EducationDetailImpl implements EducationDetailInterface {

	@Autowired 
	public EducationDetailRepo educationDetailRepo;
	
	@Override
	public boolean addEducation(Education edu) {
		// TODO Auto-generated method stub
		educationDetailRepo.save(edu);		
		return true;
	}

}
