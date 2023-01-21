package com.payrollsystem.payrollMgtsys.excephandl;

public class ErrorResponse {

	public String errMsg;
	public int statusCode; 


	public ErrorResponse(int statusCode,String errMsg) {
		super();
		this.errMsg = errMsg;
		this.statusCode = statusCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
}
