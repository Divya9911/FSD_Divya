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

		int []revArray = rev.getSorted(arr);
		System.out.println("Array elements after sorting");
		for(int i = 0;i < revArray.length ;i++ ){
			System.out.println(revArray[i]);
		}
	}
	int[] getSorted(int []arr){
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
		return arr;
	}
}