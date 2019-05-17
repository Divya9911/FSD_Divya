import java.util.Scanner;
class PositiveString{
	public static void main(String[] args) {
		PositiveString ps = new PositiveString();
		char ch;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Enter the String");
		//sc.next();
		//sc.nextLine();
		String str = sc.nextLine();
		//sc.next();
		System.out.println(ps.checkPositiveString(str));
		System.out.println("Want to enter more String(y/n)");
		
	}
}
	boolean checkPositiveString(String str){
		char []str1 = str.toCharArray();
		int flag = 0; 
		for(int i =0 ;i<str1.length;i++ ){
			for(int j = i+1; j<str1.length;j++){
				if(str1[i] > str1[j]){
					flag = 1;
					break;				
				}
			}
		}
		/*for(int i = 0; i<str1.length; i++){
			if(str1[i]>str1[i+1]){
				flag=1;
				break;
			}
		}*/
		if (flag == 1){
			return false;
		}
		else 
			return true;
	}
}