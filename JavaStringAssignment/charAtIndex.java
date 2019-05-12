import java.util.Scanner;
class charAtIndex
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter a specific index");
		int n = sc.nextInt();
		if(n<str.length()){
			System.out.println("Character at specific index is: " +str.charAt(n));
		}

	}
}