import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
class SqrOfNumberInHashMap{
	public static void main(String[] args) {
		SqrOfNumberInHashMap s =new SqrOfNumberInHashMap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String of number");
		String str = sc.nextLine();
		str = str.replace(" ","");
		char[] chArr = str.toCharArray();
		HashMap<Integer, Integer> hmap = s.getSquares(chArr);
		for(Map.Entry<Integer,Integer> ref : hmap.entrySet()){
			System.out.println(ref.getKey() +" : " + ref.getValue());
		}
	}
	HashMap<Integer, Integer> getSquares(char []chArr){
		HashMap<Integer , Integer> hmap = new HashMap<>();
		for( char ch : chArr){
			int n = Integer.parseInt(String.valueOf(ch));
			hmap.put(n, n*n);
		}
		return hmap;
	}

}