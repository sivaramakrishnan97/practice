package com.accenture;

public class Client {
	
	private void sub() {

	}
	private static void search() throws EmployeeNotFoundException {
			String id ="1234";
			if (id.equals("234")) {
				System.out.println("employee is present");
			}else {
				throw new EmployeeNotFoundException();
			}
	}
public static void main(String[] args) throws EmployeeNotFoundException {
	search();
}
}
