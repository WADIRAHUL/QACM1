package Collections;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList<Object> lis=new LinkedList<Object>();
		lis.add(10);
		lis.add('a');
		lis.add("sd");
		lis.addFirst("hello");
		lis.addLast("bye");
		System.out.println(lis.size());
	
		System.out.println(lis);
		System.out.println(lis.getFirst());
		System.out.println(lis.getLast());
		
	}		
}
