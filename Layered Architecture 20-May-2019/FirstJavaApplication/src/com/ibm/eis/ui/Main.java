package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;
import com.ibm.eis.service.EmployeeServiceInterface;

public class Main {

	public static void main(String[] args) {
		EmployeeServiceInterface service =new EmployeeServiceClass();
		
		Scanner sc = new Scanner(System.in);
		int id;
		while(true) {
			while(true) {
		System.out.println("Enter employee id");
		id = sc.nextInt();
		
		if(!(service.checkId(id))) {
			break;
			
		}
		
		System.out.println("Id already exists");
		}
		System.out.println("Enter employee salary");
		int Salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name");
		String name = sc.nextLine();
		System.out.println("Enter employee designation");
		String designation = sc.nextLine();
		String insuaranceScheme = null;
		Employee emp =new Employee();
		emp.setId(id);
		emp.setSalary(Salary);
		emp.setName(name);
		emp.setDesignation(designation);
		emp.setInsuaranceScheme(insuaranceScheme);
		
		service.storeIntoMap(id,emp);
		service.findInsuaraceScheme(emp);
		
		System.out.println("Display the employee details");
		System.out.println(service.EmpDetails());
		}
	
		
	}

	
}
