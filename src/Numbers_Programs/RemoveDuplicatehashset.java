package Numbers_Programs;

import java.util.HashSet;

public class RemoveDuplicatehashset {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,1};
		HashSet<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			set.add(a[i]);
		}	
		System.out.println(set);
	}
}
