package Collections;

import java.util.Hashtable;

public class Set5 {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<Integer, String>();
		h.put(10, "1");
		h.put(20, "A");
		h.put(30, "Helloo");
		h.put(50, "good");
		System.out.println(h);
		h.remove(30);
		System.out.println(h);
	}
}
