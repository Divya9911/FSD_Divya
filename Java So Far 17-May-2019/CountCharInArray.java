import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
class CountCharInArray{
	public static void main(String[] args) {
	CountCharInArray cin = new CountCharInArray();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	str = str.replace(" ","");
	char []chArray = str.toCharArray();
	/*for(int i =0; i<chArray.length ;i++){
		System.out.println(chArray[i]);
	}*/
	HashMap<Character , Integer> hmap = cin.countChar(chArray);
	for (Map.Entry entry : hmap.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
	}


}
	HashMap<Character, Integer>  countChar(char []chArray){
		HashMap<Character, Integer> hmap =new HashMap();
		for(char ch : chArray){
			if(hmap.containsKey(ch)){
				hmap.put(ch,hmap.get(ch)+1);
				System.out.println("Yes");
				System.out.println(hmap.get(ch));
			}
			else{
				hmap.put(ch,1);
			}
		}
		return hmap;
	}
}