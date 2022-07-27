package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set3 {

	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<Object>();
		h.add(10);
		h.add('S');
		h.add('A');
		h.add("hi");
		h.add(null);
		h.add(null);
		System.out.println(h);
		Iterator<Object> l=h.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	

	}

}
