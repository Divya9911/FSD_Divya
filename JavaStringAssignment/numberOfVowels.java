import java.util.Scanner;
class numberOfVowels{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int count =0;
		int i;
		for(i=0 ; i<str.length();i++){
			
			if(str.charAt(i)=='a' ||str.charAt(i)=='A' ||str.charAt(i)=='e' ||str.charAt(i)=='E' ||str.charAt(i)=='i' ||str.charAt(i)=='I' ||
				str.charAt(i)=='o' ||str.charAt(i)=='O' ||str.charAt(i)=='u' ||str.charAt(i)=='U'){
				count++;
			}
		}
		System.out.println("Number of vowels in string are:" +count);
		
	}
}