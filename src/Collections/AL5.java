package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AL5 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(60);
		System.out.println(al);
		Iterator i=al.iterator();
		if (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
