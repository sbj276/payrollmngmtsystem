package com.payrollsystem.payrollMgtsys.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payrollsystem.payrollMgtsys.model.Employee;
import com.payrollsystem.payrollMgtsys.service.EmployeeDetailInterface;

@RestController
@RequestMapping("/employe-details")
public class EmployeeDetailsController {
	
	@GetMapping("/hello-world")
	public String addEducation() {
		
		return "hello World";
	}
	
	@Autowired
	private EmployeeDetailInterface employeeDetailInterface;
	
	@PostMapping("/add-amp")
	public ResponseEntity addEmpDetails(@RequestBody Employee emp) {
		
//		 DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		  String convertedDate = sdf.format(emp.getHire_Date());
		  
		employeeDetailInterface.addEmployee(emp);
		return ResponseEntity.ok().build();
	}

}
