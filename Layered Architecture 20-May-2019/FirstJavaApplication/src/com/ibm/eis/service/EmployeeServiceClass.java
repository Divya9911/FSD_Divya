package com.ibm.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.EmployeeDaoClass;

public class EmployeeServiceClass implements EmployeeServiceInterface {

	//Map<Integer,Employee> hmap = new HashMap();
	EmployeeDaoClass dao = new EmployeeDaoClass();
	String str ="";
	@Override
	/*public void storeIntoMap(Employee emp1,Employee emp2, Employee emp3) {
		hmap.put(1,emp1);
		hmap.put(2,emp2); 
		hmap.put(3,emp3);
	}*/
	public void storeIntoMap(int id, Employee emp) {
		dao.storeIntoMap(id,emp);
		//hmap.put(id, emp);
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
