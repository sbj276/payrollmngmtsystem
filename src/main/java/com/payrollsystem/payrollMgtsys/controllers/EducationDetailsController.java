package com.payrollsystem.payrollMgtsys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payrollsystem.payrollMgtsys.model.Education;
import com.payrollsystem.payrollMgtsys.service.impl.EducationDetailImpl;

@RestController
@RequestMapping("/education")
public class EducationDetailsController {

	@Autowired
	public EducationDetailImpl educationDetailImpl;
	
	@PostMapping("/add-edu")
	public ResponseEntity addEducation(@RequestBody Education edu) {
		educationDetailImpl.addEducation(edu);
		return ResponseEntity.ok().build();
	}
}
