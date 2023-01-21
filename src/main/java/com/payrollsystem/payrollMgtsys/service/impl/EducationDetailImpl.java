package com.payrollsystem.payrollMgtsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.payrollsystem.payrollMgtsys.ApplicationConstant.employeeNotExistExceptionMsg;
import com.payrollsystem.payrollMgtsys.excephandl.EmployeeNotExist;
import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.repo.EducationDetailRepo;
import com.payrollsystem.payrollMgtsys.service.EducationDetailInterface;

@Component
public class EducationDetailImpl implements EducationDetailInterface {

	@Autowired 
	public EducationDetailRepo educationDetailRepo;
	
	@Autowired
	public EmployeeDetailImpl empDetail;
	
	@Override
	public boolean addEducation(Education edu) {
		// TODO Auto-generated method stub
		if(empDetail.getEmployee(edu.getEmployee_id()) != null){
			educationDetailRepo.save(edu);		
		}else {
			throw new EmployeeNotExist(employeeNotExistExceptionMsg+edu.getEmployee_id());
		}		
		return true;
	}

}
