package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;
import com.ibm.eis.service.EmployeeServiceInterface;

public class Main {

	public static void main(String[] args) {
		EmployeeServiceInterface service =new EmployeeServiceClass();
		/*Employee emp1 =new Employee(1,"A",2000,"Clerk");
		Employee emp2 =new Employee(3,"B",5000,"Project Manager");
		Employee emp3 =new Employee(2,"C",8000,"Manager");*/
		
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
		//emp.setInsuaranceScheme(insuaranceScheme);
		//System.out.println("Employee Details are");
		//System.out.println(emp1);
		//System.out.println("Calling this fn");
		
		//service.storeIntoMap(emp1,emp2,emp3);
		
		//service.findInsuaraceScheme(emp1);
		System.out.println("Display the employee details");
		System.out.println(service.EmpDetails());
		}
	
		
	}

	
}