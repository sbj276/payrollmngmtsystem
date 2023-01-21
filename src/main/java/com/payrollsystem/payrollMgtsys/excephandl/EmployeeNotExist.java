package com.payrollsystem.payrollMgtsys.excephandl;

public class EmployeeNotExist extends RuntimeException{
	public String msg;

	public EmployeeNotExist(String msg) {
		super();
		this.msg = msg;
	}
	

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public EmployeeNotExist() {
	}
	
}
