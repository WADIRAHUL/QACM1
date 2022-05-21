package Array_List;

import java.util.ArrayList;

public class AL4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(60);
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
