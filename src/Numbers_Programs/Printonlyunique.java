package Numbers_Programs;

import java.util.HashSet;

public class Printonlyunique {

	public static void main(String[] args) {
		int a[]= {4,1,3,3,2};
		HashSet<Integer> l=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		System.out.println(l);
		for (Integer in : l) 
		{
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==in)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("unique value is " +in);
		}
		}
			
	}
}
