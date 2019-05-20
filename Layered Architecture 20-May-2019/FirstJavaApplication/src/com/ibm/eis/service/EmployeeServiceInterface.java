package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeServiceInterface{
	String EmpDetails();
	
	void findInsuaraceScheme(Employee emp);
	void storeIntoMap(int id, Employee emp);
	boolean checkId(int id);
	
	

}
