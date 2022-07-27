package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> h=new TreeMap<Integer,String>();
		h.put(10, "A");
		h.put(20, "Abc");
		//h.put(null, "Helloo");
		//h.put(null, "20");
		h.put(30, "a");
		h.put(70, null);
		h.put(50, "bad");
		System.out.println(h);
		for (Entry<Integer, String> ha:h.entrySet()) {
			System.out.println(ha.getKey()+" "+ha.getValue());	
		} 
		
	}
}
