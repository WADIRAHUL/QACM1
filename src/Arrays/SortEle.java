package Arrays;

import java.util.Arrays;

public class SortEle {

	public static void main(String[] args) {
		int n=9999;
		int res=n*2;
		int temp=n;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int a[]=new int[count]; 
		int b[]=new int[count]; 

		for (int i = 0; i <count; i++) {		
			a[i]=n%10;
			b[i]=res%10;
			n=n/10;
			res=res/10;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
	}
}
