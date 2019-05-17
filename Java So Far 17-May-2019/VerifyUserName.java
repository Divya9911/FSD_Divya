import java.util.Scanner;
class VerifyUserName{
	public static void main(String[] args) {
		VerifyUserName user =new VerifyUserName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name ending with _job");
		String name = sc.nextLine();
		System.out.println(user.verifyName(name));
	}
	boolean verifyName(String name){
		String postfix ="";
		int i =name.lastIndexOf('_');
		if(i>0){
			postfix = name.substring(i+1);
		}
		if(postfix.equals("job") && name.length()>8 ){
			return true;
		}
		else
			return false;
		

	}
}