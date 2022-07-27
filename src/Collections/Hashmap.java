package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(10, "1");
		h.put(20, "A");
		h.put(30, "Helloo");
		h.put(50, "good");
		h.put(60, null);
		h.put(50, "bad");
		System.out.println(h);
		for (Entry<Integer, String> ha:h.entrySet()) {
			System.out.println(ha.getKey()+" "+ha.getValue());	
		} 
		
	}
}
