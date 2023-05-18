package com.accenture;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		String msg= "Employee not found in DataBase";
		return msg;
	}
	
	
	
	
	

}
