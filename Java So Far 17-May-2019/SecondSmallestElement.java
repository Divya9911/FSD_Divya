import java.util.Scanner;
class SecondSmallestElement{
	public static void main(String[] args) {
		SecondSmallestElement second = new SecondSmallestElement();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Second smallest element of array is :"+ second.getSecondSmallest(arr));
	}
	int getSecondSmallest(int []arr){
		int small;
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length ;j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp; 
				}
			}
		}
		small = arr[1];  
		return small;
	}
}