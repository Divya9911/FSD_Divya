import java.util.Scanner;
class PositiveNumber{
	public static void main(String[] args) {
		PositiveNumber positive = new PositiveNumber();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		System.out.println(positive.checkNumber(n));
		
	}
	boolean checkNumber(int n){
		String num = Integer.toString(n);
		char[] num1 = num.toCharArray();
		int flag = 0;
		try{
		for(int i = 0; i < num1.length ; i++ ){
			for(int j=i+1 ; j< num1.length ;j++){
			if(num1[i] > num1[j]){
				flag = 1;
				break;
			}}
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid index");
		}
		if(flag == 0){
			return true;
		}
		else{
			return false;
		}
	}
}