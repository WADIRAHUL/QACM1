package Collections;

import java.util.LinkedHashSet;

public class Set1 {

	public static void main(String[] args) {
		LinkedHashSet<Object> h=new LinkedHashSet<Object>();
		h.add(3);
		h.add(20);
		h.add('A');
		h.add("hi");
		h.add(null);
		h.add(10);
		System.out.println(h);
	}
}
