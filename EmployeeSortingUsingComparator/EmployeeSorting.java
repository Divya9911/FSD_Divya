import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
class Employee{
private String name,address,firstName,lastName;
private Integer id,age; 
Employee(String name, Integer id, String address, Integer age){
	this.name = name;
	this.id = id;
	this.address = address;
	this.age = age;
	String[] splitFullname = name.split(" ");
	if(splitFullname.length>1){
		this.firstName = splitFullname[0];
		this.lastName = splitFullname[(splitFullname.length)-1];
	}
	else{
		this.firstName =name;
		this.lastName ="";
	}
}
@Override
public String toString(){
	//return "Name: " +name+" , "+"Id: "+id+" , "+"Address: "+ address +" , "+"Age: "+age; 
	//return "Name of employee: "+ this.name;
	return this.name +" "+ this.id+" "+ this.address + " "+this.age ;
}

public String getName(){
	return this.name;
}
public String getFirstName(){
	return this.firstName;
}
public String getLastName(){
	return this.lastName;
}

public Integer getId(){
	return this.id;
}
public Integer getAge(){
	return this.age;
}
public String getAddress(){
	return this.address;
}

}


class EmpSortByComparator{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		EmpSortByComparator emp = new EmpSortByComparator();
		Scanner sc =new Scanner(System.in);
		char ch;
		do{
			sc.nextLine();
			System.out.println("Enter the Name of Employee");
			String name = sc.nextLine();
			System.out.println("Enter the Id of Employee");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Address of Employee");
			String address = sc.nextLine();
			System.out.println("Enter the Age of Employee");
			Integer age  = sc.nextInt();
			list.add(new Employee(name,id,address,age));
			System.out.println("Want to add more(y/n)");
			ch = sc.next().charAt(0);
			
		} while(ch=='y');
		//Collections.sort(list,new SortByFirstName());
		//System.out.println("Contents of list after sorting:"+ list);
		System.out.println("Press 1: Sort By First Name \n Press 2: Sort By Last Name \n Press 3: Sort By Age \n Press 4: Sort by Id \n Press 5: Sort By Address ");
		int choice = sc.nextInt();
		//emp.sortByFirstName(list);
		switch(choice){
			case 1:  Collections.sort(list,new SortByFirstName());
					System.out.println("Contents of list after sorting:"+ list);
					break;
			case 2: Collections.sort(list,new SortByLastName());
					System.out.println("Contents of list after sorting:"+ list);
					break;

			case 3: Collections.sort(list,new SortByAge());
				    System.out.println("Contents of list after sorting:"+ list);
					break;

			case 4: Collections.sort(list,new SortById());
					System.out.println("Contents of list after sorting:"+ list);
					break;

			case 5: Collections.sort(list,new SortByAddress());
					System.out.println("Contents of list after sorting:"+ list);
					break;

		default: System.out.println("Entered a wrong choice");
		//}
		}

/*void sortByFirstName(ArrayList list){
	String[] splitFullname= null;
	for(int value =0 ; value < list.size(); value++){
	String fullname =((Employee)list.get(value)).getName();
	splitFullname = fullname.split(" ");
	
	String firstName = splitFullname[0];
	String lastName =splitFullname[(splitFullname.length)-1];
	Collections.sort(list,new SortByFirstName());
	}
	//System.out.println(name);
}*/
}
}

class SortByFirstName implements Comparator{//string and Wrapper class implements Comaparble and Comparator interface
	@Override
	public int compare(Object firstObject, Object secondObject){
		return ((Employee)firstObject).getFirstName().compareToIgnoreCase(((Employee)secondObject).getFirstName());
	}

}

class SortByLastName implements Comparator{//string and Wrapper class implements Comaparble and Comparator interface
	@Override
	public int compare(Object firstObject, Object secondObject){
		return ((Employee)firstObject).getLastName().compareToIgnoreCase(((Employee)secondObject).getLastName());
	}

}

class SortById implements Comparator{//string and Wrapper class implements Comaparble and Comparator interface
	@Override
	public int compare(Object firstObject, Object secondObject){
		return ((Employee)firstObject).getId().compareTo(((Employee)secondObject).getId());
	}

}

class SortByAge implements Comparator{//string and Wrapper class implements Comaparble and Comparator interface
	@Override
	public int compare(Object firstObject, Object secondObject){
		return ((Employee)firstObject).getAge().compareTo(((Employee)secondObject).getAge());
	}

}

class SortByAddress implements Comparator{//string and Wrapper class implements Comaparble and Comparator interface
	@Override
	public int compare(Object firstObject, Object secondObject){
		return ((Employee)firstObject).getAddress().compareToIgnoreCase(((Employee)secondObject).getAddress());
	}

}


