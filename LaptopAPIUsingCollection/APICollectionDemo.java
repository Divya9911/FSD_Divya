import java.util.ArrayList;
import java.util.Scanner;
class Laptop{
	private Integer ramSize,hddSize;
	private String brand;
	private Integer id;
	Laptop(Integer id,Integer ramSize, Integer hddSize, String brand){
		this.id = id;
		this.ramSize = ramSize;
		this.hddSize =hddSize;
		this.brand = brand;

	}
	//getter methods
	public Integer getId(){
		return this.id;
	}

	public Integer getRamSize(){
		return this.ramSize;
	}
	public Integer getHddSize(){
		return this.hddSize;
	}
	public String getBrand(){
		return this.brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setRamSize(Integer ramSize){
		this.ramSize = ramSize;
	}
	public void setHddSize(Integer hddSize){
		this.hddSize = hddSize;
	}

	public String toString(){
		return id +" " + ramSize +" " + hddSize +" "+ brand;
		}
	//@Override
	/*public boolean equals(Object ob){
		if(this.getId().equals(((Laptop)ob).getId())){//Typecast to shirt object because object class does'nt contain getColor()method
			return true;
		}
		else
		{
			return false;
		}
	}*/

}
class APICollectionDemo{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		APICollectionDemo d = new APICollectionDemo();
		Laptop l = new Laptop(1,8,400,"Lenovo");
		list.add(new Laptop(2,3,600,"IBM")); 
		list.add(new Laptop(3,8,800,"DELL"));
		list.add(new Laptop(4,3,600,"IBM"));
		list.add(l);
		System.out.println("Details of laptop before adding new Laptop details: " +list);
		char ch;

		do{
		System.out.println("Press 1 for Enter a new laptop\n Press 2 for View all laptop details \n Press 3 for searching Laptop \n Press 4 for deleting the laptop \n Press 5 for updating laptop details ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : d.addNewLaptopDetails(list);
					break;
			case 2 : d.viewLaptopDetails(list);
					break;
		    case 3 : d.searchLaptop(list);
					break;
			case 4 : d.deleteLaptopDetails(list);
				    break;
			case 5 :d.updateLaptopDetails(list);
				    break;
			default : System.out.println("Entered a wrong choice"); 
		}
	
		System.out.println("Want to continue(y/n)");
		ch = sc.next().charAt(0);
		
		
		}while(ch=='y');
	}
	void addNewLaptopDetails(ArrayList list){ // function for adding new Laptop details. 
		Scanner sc = new Scanner(System.in); 
		char ch;
		Integer id;
		int flag = 0;
		System.out.println("Enter id");
		 id = sc.nextInt();
		System.out.println("Enter size of RAM");
		int sizeR = sc.nextInt();
		System.out.println("Enter size of harddisk");
		int sizeH = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter brand");
		String b = sc.nextLine();
		for(int value = 0; value<list.size(); value++){
			if(id.equals(((Laptop)list.get(value)).getId())){
				System.out.println("Id already exist cannot add laptop details with same id");
				flag=1;
				break;
			}
		}
		if (flag==0){
		list.add(new Laptop(id,sizeR,sizeH,b));
		}
		//System.out.println("Laptop details are: " + list);
	}
	void viewLaptopDetails(ArrayList list){
		for(int value = 0; value<list.size(); value++){
			System.out.println("Laptop details are: " +list.get(value));
		}
	}
	void searchLaptop(ArrayList list){
		System.out.println("Search by \n Press 1. By id \n Press 2 By Brand");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch){
			case 1 : System.out.println("enter id");
					Integer searchId =sc.nextInt();
					for(int value = 0; value< list.size();value++){
						if(searchId.equals(((Laptop)list.get(value)).getId())){
							System.out.println("The details of laptop that you have searched are:" +list.get(value));
						}
					}
					break;
					

			case 2 : System.out.println("Enter Brand");
					 String brand = sc.next();
					 for(int value = 0; value< list.size();value++){
						if(brand.equals(((Laptop)list.get(value)).getBrand())){
							System.out.println("The details of laptop that you have searched are:" +list.get(value));
						}
					}
					break;

		
			default :
					System.out.println("entered wrong choice"); 
	}}


	void deleteLaptopDetails(ArrayList list){
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter id");
		Integer deleteId = sc.nextInt();
		int flag=0;
		for(int value = 0; value < list.size(); value++){
			if(deleteId.equals(((Laptop)list.get(value)).getId())){
				list.remove(value);
				System.out.println("Item removed");
				flag=1;
				break;
			}
		}
			if(flag==0){
				System.out.println("Id not found");
			}

	}


	void updateLaptopDetails(ArrayList list){
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter id whose value you want to update");
		Integer id = sc.nextInt();
		System.out.println("What you want to update ? Press \n 1. RAM Size \n 2.Harddisk Size \n 3.Brand ");
		int ch = sc.nextInt();
		switch(ch){
			case 1 : System.out.println("Enter New RAM Size");
					 Integer ramSize = sc.nextInt();
					for(int value = 0; value< list.size();value++){
						if(id.equals(((Laptop)list.get(value)).getId())){
							((Laptop)list.get(value)).setRamSize(ramSize);
						}
					}
					break;
			case 2 : System.out.println("Enter New Harddisk Size");
					 Integer hddSize = sc.nextInt();
					for(int value = 0; value< list.size();value++){
						if(id.equals(((Laptop)list.get(value)).getId())){
							((Laptop)list.get(value)).setHddSize(hddSize);
						}
					}
					break;
			
			
			case 3 : System.out.println("Enter New brand value");
					 String brand = sc.next();
					for(int value = 0; value< list.size();value++){
						if(id.equals(((Laptop)list.get(value)).getId())){
							((Laptop)list.get(value)).setBrand(brand);
						}
					}
					break;
			default: 
			System.out.println("entered a wrong choice");

		}
		

	}
}
