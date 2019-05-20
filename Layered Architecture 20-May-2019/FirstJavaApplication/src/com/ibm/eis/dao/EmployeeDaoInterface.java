package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeDaoInterface {
	public void storeIntoMap(int id, Employee emp);
	public void findInsuaranceScheme(Employee emp);
	public Map EmpDetails();
	public boolean checkId(int id);
	
}
