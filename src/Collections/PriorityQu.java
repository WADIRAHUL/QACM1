package Collections;

import java.util.PriorityQueue;

public class PriorityQu {

	public static void main(String[] args) {
	PriorityQueue<Object> pq=new PriorityQueue<Object>();
	pq.add('A');
	pq.add('A');
	pq.add('D');
	pq.add('D');
	System.out.println(pq.peek());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	
	
	}
	
	}