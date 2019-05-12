import java.util.Scanner;
class checkCharSequence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine();
		System.out.println("Enter sequence of char values");
		String str2 = sc.nextLine();
		if(str1.contains(str2)){
			System.out.println("String contains specified char values..");
		}
		else{
			System.out.println("String does'nt contain specified char values..");
		}
		
	}
}