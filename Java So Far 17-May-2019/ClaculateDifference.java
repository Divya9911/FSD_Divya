import java.util.Scanner;
class ClaculateDifference{
	public static void main(String[] args) {
		CalculateDifference difference = new CalculateDifference();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		System.out.println("Difference is: "+difference.calculateDifference(n));
	}
	int calculateDifference(int n){
		int diff;
		int sumWholeSquare=0;
		int sumSquareOfDigit=0;
		for(int i=1 ;i<=n;i++){
			sumSquareOfDigit = sumSquareOfDigit + i*i; 
			sumWholeSquare =sumWholeSquare + i;
		}
		diff = (sumWholeSquare*sumWholeSquare)-sumSquareOfDigit;
		return diff; 
	}
}