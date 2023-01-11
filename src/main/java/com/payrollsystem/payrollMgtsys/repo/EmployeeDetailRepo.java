package com.payrollsystem.payrollMgtsys.repo;

import org.springframework.data.repository.CrudRepository;

import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.model.Employee;

public interface EmployeeDetailRepo extends CrudRepository<Employee, Integer>{

}
