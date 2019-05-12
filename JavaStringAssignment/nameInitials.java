import java.util.Scanner;
class nameInitials{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String initial = "";
		initial = initial+str.charAt(0);
		for(int i = 0; i<str.length();i++){
			if(str.charAt(i)==' ')
			{
				initial = initial +str.charAt(i+1);
			}
		}
		System.out.println(initial);
	}}
