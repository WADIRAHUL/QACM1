package Collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
		h.put(10, "A");
		h.put(20, "Abc");
		h.put(null, "Helloo");
		h.put(null, "20");
		h.put(60, null);
		h.put(70, null);
		h.put(50, "bad");
		System.out.println(h);
		for (Entry<Integer, String> ha:h.entrySet()) {
			System.out.println(ha.getKey()+" "+ha.getValue());	
		} 
		
	}
}
