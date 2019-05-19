import java.util.Scanner;
import java.util.Arrays;
class SortInUpperAndLower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str.toLowerCase();
		String []strArr =str.split(" ");
		Arrays.sort(strArr);
		int length = strArr.length;
		if(length%2 == 0){
			for(int i = 0; i < length/2 ;i++){
				strArr[i]=strArr[i].toUpperCase();
			}
		}
		else{
			for(int i = 0; i < (length/2)+1 ;i++){
				strArr[i]=strArr[i].toUpperCase();
			}
		}
		System.out.println(String.join(" ",strArr));
	}
}