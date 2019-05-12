import java.util.*;
import java.lang.*;
class stringPalindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check");
		String str = sc.nextLine();
		String reverse ="";
		int i;
		for(i= str.length()-1; i>=0;i--)
		{
			reverse = reverse + str.charAt(i); 
		}
		System.out.println(reverse);
		if(str.equals(reverse))
		{
			System.out.println("Strings are palindrome");
		}
		else
		{
			System.out.println("Strings are not palindrome");
		}
         
         
}}
