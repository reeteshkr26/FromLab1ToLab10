package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	public EmployeeException(){
		System.out.print("This is my exception...");
	}
	public EmployeeException(String msg){
		System.out.print("This is my exception: "+msg);
	}

}
