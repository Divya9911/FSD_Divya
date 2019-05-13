import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String primeNumbers = "";
		for(int i=2 ;i<=n; i++ ){
			int count=0;
			for(int j=i; j>=1 ;j--){
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2){
				primeNumbers = primeNumbers + i +" ";

			}

			}
			System.out.println(primeNumbers);
		}
	}
