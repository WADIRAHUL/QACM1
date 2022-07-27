package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class AllProg {

	
	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add("Hello Bro");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		PriorityQueue<Object> que = new PriorityQueue<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que);
		
		HashSet<Object> hset = new HashSet<>();
		hset.add(10);
		hset.add('A');
		hset.add("Hello");
		hset.add(50);
		hset.add(null);
		System.out.println(hset);
		ArrayList<Object> aList = new ArrayList<>(hset);
		Collections.reverse(aList);
		System.out.println(aList);	
		Iterator it = aList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
