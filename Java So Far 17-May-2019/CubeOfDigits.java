import java.util.Scanner;
class CubeOfDigits{
	public static void main(String[] args) {
		CubeOfDigits cd = new CubeOfDigits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Sum of cube of digits is: "+ cd.sumOfCubeOfDigits(n));
}
		int sumOfCubeOfDigits(int n){
			int d;
			int sum = 0;
			while(n>0){
				d = n %10;
				sum = sum +d*d*d;
				n = n/10;
			}
			return sum;
		}
}