package com.payrollsystem.payrollMgtsys.excephandl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerForApp {

	@ExceptionHandler(EmployeeNotExist.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody ErrorResponse handleEmployeeNotExists(EmployeeNotExist emp) {
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), emp.getMsg());
	}
}
