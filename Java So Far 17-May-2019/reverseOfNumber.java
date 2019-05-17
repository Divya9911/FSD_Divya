import java.util.Scanner;
class reverseOfNumber{
	public static void main(String[] args) {
		reverseOfNumber rev = new reverseOfNumber();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < n;i++){
			arr[i]=sc.nextInt();
		}

		int []revArray = rev.getSorted(arr,n);
		System.out.println("Array elements after sorting");
		for(int i = 0;i < revArray.length ;i++ ){
			System.out.println(revArray[i]);
		}
	}
	int[] getSorted(int []arr,int n){
		
		int []arr1 = new int[n];
		int temp;
		int rev=0;
		int d;
		for(int i=0; i<arr.length; i++)
		{	
			rev=0;
			while(arr[i] != 0){
				d = arr[i]%10;
				rev= rev*10+d;
				arr[i]=arr[i]/10;
			}
			arr1[i] = rev;

		}
		for(int i=0 ;i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length ;j++)
			{
				if(arr1[i] > arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp; 
				}
			}
			//System.out.println(rev);
		}
		return arr1;
	}
}