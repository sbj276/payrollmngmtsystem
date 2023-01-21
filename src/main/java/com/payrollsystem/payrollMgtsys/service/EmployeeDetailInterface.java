package com.payrollsystem.payrollMgtsys.service;

import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.model.Employee;

public interface EmployeeDetailInterface {
	public boolean addEmployee(Employee emp);
	public Employee getEmployee(int id);
}
