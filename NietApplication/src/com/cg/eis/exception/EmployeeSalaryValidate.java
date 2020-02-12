package com.cg.eis.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import capgemini.firstproject.welcome.MyException;

public class EmployeeSalaryValidate {
	double salary;
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		EmployeeSalaryValidate vObject=new EmployeeSalaryValidate();
		vObject.isr=new InputStreamReader(System.in);
		vObject.buff=new BufferedReader(vObject.isr);
		
		vObject.checkSalary();
		

	}
	private void checkSalary() {
		try {
			System.out.print("Enter your salary: ");
			salary=Double.parseDouble(buff.readLine());
			
			if(salary<3000.0) {
				throw new MyException("Salary below than 3000..");
			}
			else {
				System.out.print("Salary is "+ salary);
			}
		} catch (IOException | MyException e) {
			
			//e.printStackTrace();
		}
		
	}

}
