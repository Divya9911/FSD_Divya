package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeServiceInterface {
	//void findInsuaranceScheme(Employee emp1);
	String EmpDetails();
	//void storeIntoMap(Employee emp);
	void findInsuaraceScheme(Employee emp);
	void storeIntoMap(int id, Employee emp);
	boolean checkId(int id);
	//void storeIntoMap(Employee emp);

	//void findInsuaranceScheme(Employee emp1);

	//void storeIntoMap(Employee emp1,Employee emp2, Employee emp3);

	//void findInsuaraceScheme(Employee emp1);

	
	

}
