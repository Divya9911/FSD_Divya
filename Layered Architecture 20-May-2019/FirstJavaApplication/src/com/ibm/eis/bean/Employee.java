package com.ibm.eis.bean;

public class Employee {

		private int id;
		private String name;
		private int Salary;
		private String designation;
		private String insuaranceScheme;
		
		
				
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getSalary() {
			return Salary;
		}
		public void setSalary(int Salary) {
			this.Salary = Salary;
		}
		
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		public String getInsuaranceScheme() {
			return insuaranceScheme;
		}
		public void setInsuaranceScheme(String insuaranceScheme) {
			this.insuaranceScheme = insuaranceScheme;
		}
	
		@Override
		public String toString() {
			return "name=" + name + ", id= " + id +" , InsuaranceScheme = "+this.insuaranceScheme; 
		}
}