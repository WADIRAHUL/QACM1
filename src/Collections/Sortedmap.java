package Collections;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {

	public static void main(String[] args) {
		SortedMap<Integer, String> h=new TreeMap<Integer, String>();
		h.put(10, "A");
		h.put(20, "Abc");
		//h.put(null, "Helloo");
		//h.put(null, "20");
		h.put(30, "a");
		h.put(60, "bye");
		h.put(50, "bye");
		System.out.println(h);
		for (Entry<Integer, String> ha:h.entrySet()) {
			System.out.println(ha.getKey()+" "+ha.getValue());	
		} 
		
	}
}
