package Array_List;

import java.util.ArrayList;
import java.util.ListIterator;

public class AL7 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(60);
		System.out.println(al);
		ListIterator<Integer> i=al.listIterator(1);
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.previous());
		System.out.println(i.previous());
		i.remove();
		System.out.println(al);	
	}
}
