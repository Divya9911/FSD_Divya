import java.util.Scanner;
class AdditionOfNumbers{
	public static void main(String[] args) {
		AdditionOfNumbers addition = new AdditionOfNumbers();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		System.out.println("Sum of numbers divisible by 3 or 5 are : " +addition.calculateSum(n));
		
	}
	int calculateSum(int n){
		int sum = 0;
		for(int i = 1; i<=n ;i++){
			if(i % 3== 0 || i % 5==0){
				sum = sum + i; 
			}
		}
		return sum;
	}
}