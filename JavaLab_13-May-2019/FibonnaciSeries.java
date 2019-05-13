import java.util.Scanner;
class FibonnaciSeries
{
	public static void main(String[] args) {
		FibonnaciSeries f = new FibonnaciSeries(); 		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x = 0;
		int y = 1;
		int i=0;
		System.out.println("Fibonnaci Series using nonrecursive function");
		f.nonRecursive(x,y,n);
		System.out.println("Fibonnaci Series using recursive function");
		for(int c=0; c<n ;c++){
		System.out.println(f.recursiveFib(i));
		i++;
		}}

		int recursiveFib(int n){
			if(n == 0){
				return 0;
			}
			else if(n == 1)
			{
				return 1;
			}
			else{
				return (recursiveFib(n-1)+recursiveFib(n-2));
			}
		}

		void nonRecursive(int x,int y,int n){
		int z;
		System.out.println(x);
		System.out.println(y);
		for(int i =1; i<=n-2; i++){
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
		}}

	}
