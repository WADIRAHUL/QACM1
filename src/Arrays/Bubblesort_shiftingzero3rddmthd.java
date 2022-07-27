package Arrays;

import java.util.Arrays;

public class Bubblesort_shiftingzero3rddmthd {

	public static void main(String[] args) {
		int a[]= {0,0,3,4,5,0};
		int b[]= new int[a.length];
		int m=0;
		for (int i=0; i < a.length; i++) {
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(b));
		}
}
