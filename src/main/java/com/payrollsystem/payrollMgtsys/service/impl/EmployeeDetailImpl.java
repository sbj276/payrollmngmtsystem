package com.payrollsystem.payrollMgtsys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.model.Employee;
import com.payrollsystem.payrollMgtsys.repo.EmployeeDetailRepo;
import com.payrollsystem.payrollMgtsys.service.EmployeeDetailInterface;

@Component
public class EmployeeDetailImpl implements EmployeeDetailInterface {

	@Autowired 
	public EmployeeDetailRepo employeeDetailsRepo;

	@Override
	public boolean addEmployee(Employee emp) {
		employeeDetailsRepo.save(emp);		
		return true;
	}
	
	
	
}
