package com.cg.eis.exception;
import java.util.Scanner;
class EmpSalaryVerification{
	public static void main(String[] args) 
	{
		EmpSalaryVerification emp =new EmpSalaryVerification();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee's salary");
		int sal = sc.nextInt();
		try{
		emp.checkSalary(sal);
		}
		catch(EmployeeException e){
			e.printStackTrace();
		}
	}
	

		void checkSalary(int sal) throws EmployeeException{
			if (sal < 3000 )
			{
				
				throw new EmployeeException("Salary is less than 3000");
			}
			else
			{
				System.out.println("Salary is above 3000");
			}
			
		}
		
		class EmployeeException extends Exception
		{
			EmployeeException(String str)
			{
			super(str);
		 	}
		}

}
