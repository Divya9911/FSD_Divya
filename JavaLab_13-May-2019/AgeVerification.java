import java.util.Scanner;
class AgeVerification{
	public static void main(String[] args) {
		AgeVerification a =new AgeVerification();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try{
		a.checkAge(age);
		}
		catch(UserException e){
			e.printStackTrace();
		}
	}
	

		void checkAge(int age) throws UserException{
			if (age<=15){
				
				throw new UserException("Age should be greater than 15");
			}
			else
			{
				System.out.println("You are eligible!!");
			}
			
		}
		}
		class UserException extends Exception{
			UserException(String str){
			super(str);
	}

}
