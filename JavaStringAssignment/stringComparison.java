import java.util.Scanner;
class stringComparison{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.compareToIgnoreCase(str2)== 0){
			System.out.println("Both Strings are same...");
		}
		else{
			System.out.println("Strings are not same...");
		}
		//compareTo method does'nt ignores the cases.
		/*if(str1.compareTo(str2)== 0){
			System.out.println("Both Strings are same...");
		}
		else{
			System.out.println("Strings are not same...");
		}*/
	}
}