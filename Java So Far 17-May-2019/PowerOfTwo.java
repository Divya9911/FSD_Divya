import java.util.Scanner;
class PowerOfTwo{
	public static void main(String[] args) {
		PowerOfTwo pow = new PowerOfTwo();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		System.out.println("The number is power of two: "+pow.checkNumber(n));
		
	}
	boolean checkNumber(int n){
		int j = 1;
		int pow = 2;
		while (n > pow){
		pow = 2;
		for(int i=1 ; i<j ;i++){
			pow = pow *2;
			if(n == pow){
				return true;
			}
		}
		j++;	
		}
		return false;
	}
}
