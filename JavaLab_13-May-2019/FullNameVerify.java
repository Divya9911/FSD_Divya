import java.util.Scanner;
class FullNameVerify{
	public static void main(String[] args) {
		FullNameVerify f =new FullNameVerify();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName");
		String firstName = sc.nextLine();
		System.out.println("Enter LastName");
		String lastName = sc.nextLine();
		try{
		f.checkName(firstName,lastName);
		}
		catch(UserException e){
			e.printStackTrace();
		}
	}
		void checkName(String firstName , String lastName) throws UserException{
			if (firstName.equals("") || lastName.equals("")){
				System.out.println("Name is blanks");
				throw new UserException("empty name is not valid");
			}
			else
			{
				System.out.println("Name is not blank");
			}
			
		}
		}
		class UserException extends Exception{
			UserException(String str){
			super(str);
	}

}
