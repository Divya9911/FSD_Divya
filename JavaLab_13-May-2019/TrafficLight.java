import java.util.Scanner;
class TrafficLight{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice(1/2/3) \n 1. Red \n 2. Yellow \n 3.Green");
		int choice =  sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Stop");
				break;
			case 2: 
				System.out.println("Ready");
				break;
			case 3 :
				System.out.println("Go");
				break;
			default:
				System.out.println("Entered different number"); 
		}
		
	}
}
