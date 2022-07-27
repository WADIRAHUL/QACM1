package Numbers_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {4,2,3,1,2,1};
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			boolean ah = lh.add(a[i]);
		}
		for (Integer in : lh) {
			System.out.println(in);
		}
		
		
		
	}
}
