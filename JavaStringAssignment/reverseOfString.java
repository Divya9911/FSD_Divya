import java.util.*;
class reverseOfString{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
	    String reverse ="";
		int i;
		for(i= str.length()-1; i>=0;i--)
		{
			reverse = reverse + str.charAt(i); 
		}
		System.out.println(reverse);
		

	}
}
