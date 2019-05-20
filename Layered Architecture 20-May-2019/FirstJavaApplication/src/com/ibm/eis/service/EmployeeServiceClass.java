package com.ibm.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.EmployeeDaoClass;

public class EmployeeServiceClass implements EmployeeServiceInterface {
	EmployeeDaoClass dao = new EmployeeDaoClass();
	String str ="";
	@Override
	public void storeIntoMap(int id, Employee emp) {
		dao.storeIntoMap(id,emp);
	}
	
	@Override
	public String EmpDetails() {
		Map<Integer,Employee> map = (HashMap) dao.EmpDetails();
		for(Map.Entry m :map.entrySet()) {
			str = str +"Id : "+m.getKey()+ ": "+m.getValue();
		}
		return str;
	
	}

	@Override
	public void findInsuaraceScheme(Employee emp) {
		dao.findInsuaranceScheme(emp);
			
	}
	
	public boolean checkId(int id) {
		return(dao.checkId(id));
	}

	
	

}
