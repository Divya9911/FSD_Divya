import java.util.StringTokenizer;
import java.util.Scanner;
class SumOfIntegerUsingTokenizer{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter the String of number with comma");
		String numStr = sc.nextLine();
		StringTokenizer st =new StringTokenizer(numStr);
		int sum = 0;
		while(st.hasMoreTokens()){
			int token = Integer.parseInt(st.nextToken(","));
			sum = sum + token;
		}
		System.out.println("Sum of Integers is:" +sum);}
		catch(NumberFormatException e){
			System.out.println("Please enter integers only");

		}
}
}