package Array_List;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		ArrayList<Object> ls=new ArrayList<Object>();
		ls.add(10);
		ls.add(20);
		ls.add(40);
		ls.add(30);
		ls.add('a');
		ls.add('9');
		ls.add("Hello");
		ls.add(new int[5]);
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		System.out.println(ls);
	}

}
