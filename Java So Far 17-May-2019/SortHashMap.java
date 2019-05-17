import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
class SortHashMap{
	public static void main(String[] args) {
		SortHashMap s = new SortHashMap();
		HashMap<Integer,String> map =new HashMap<>();
		map.put(2,"A");
		map.put(5,"E");
		map.put(3,"C");
		map.put(4,"S");
		map.put(1,"W");
		System.out.println("Before Sorting");
		Set set = map.entrySet();//To read all the values in the set.
		Iterator iter= set.iterator();
		while(iter.hasNext()){
		Map.Entry m = (Map.Entry)iter.next();
		//System.out.print(m.getKey() +": ");
		System.out.println("value : "+m.getValue());
		}
		List list = s.getValues(map);
		Iterator iterator = list.iterator();
		System.out.println("After Sorting");
		while(iterator.hasNext()){
			System.out.println("value: " +iterator.next());
		}
	}
		

		List getValues(HashMap map){
			Set set = map.entrySet();
			ArrayList l = new ArrayList();
			for(Object obj : set){
				Map.Entry m = (Map.Entry)obj;
				l.add(m.getValue());
			} 
			Collections.sort(l);
			return l;
		}
}
		
	
	/*void getValue(HashMap<Integer,String> map){
		Collections.sort(map);
		System.out.println("Before Sorting");
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
		Map.Entry m = (Map.Entry)iterator.next();
		System.out.print(m.getKey() +": ");
		System.out.println(m.getValue());
		s.getValue(map);
		}
		Comparator<Integer,String> comparator = new Comparator<Integer,String>
		@Override
		public int compare(Entry<Integer,String> e1, Entry<Integer,String> e2){
			String value1 = e1.getValue();
			String value2 = e2.getValue();
			e1.compareTo(e2);
		}

	}*/
