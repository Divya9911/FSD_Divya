package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class EmployeeDaoClass implements EmployeeDaoInterface{
	
	Map<Integer,Employee> hmap = new HashMap();

	@Override
	public void storeIntoMap(int id, Employee emp) {
		// TODO Auto-generated method stub
		int sal = emp.getSalary();
		String designation = emp.getDesignation();
		
		if(sal>5000 && sal<20000 && designation.equals("System Associate")) {
			emp.setInsuaranceScheme("Scheme A");
			
		}
		if(sal>=20000 && sal<40000 && designation.equals("Programmer")) {
			emp.setInsuaranceScheme("Scheme B");
			
		}
		if(sal>=40000 && designation.equals("Manager")) {
			emp.setInsuaranceScheme("Scheme C");
			
		}
		 if(sal<5000 && designation.equals("Clerk")) 
		{
			emp.setInsuaranceScheme("No Scheme");
			
		}

		hmap.put(id,emp);
	}

	@Override
	public Map EmpDetails() {
		// TODO Auto-generated method stub
		return hmap;
	}

	@Override
	public void findInsuaranceScheme(Employee emp) {
		int sal = emp.getSalary();
		String designation = emp.getDesignation();
		
		if(sal>5000 && sal<20000 && designation.equals("System Associate")) {
			emp.setInsuaranceScheme("Scheme A");
			
		}
		if(sal>=20000 && sal<40000 && designation.equals("Programmer")) {
			emp.setInsuaranceScheme("Scheme B");
			
		}
		if(sal>=40000 && designation.equals("Manager")) {
			emp.setInsuaranceScheme("Scheme C");
			
		}
		 if(sal<5000 && designation.equals("Clerk")) 
		{
			emp.setInsuaranceScheme("No Scheme");
			
		}
		
	}

	@Override
	public boolean checkId(int id) {
		// TODO Auto-generated method stub
		if(hmap.containsKey(id))
		return true;
		else 
		return false;
	}
	

}
