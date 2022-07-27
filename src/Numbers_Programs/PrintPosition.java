package Numbers_Programs;

import java.util.LinkedHashSet;

public class PrintPosition {

	public static void main(String[] args) {
		int a[]= {5,2,5,7,0,1};
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		for (Integer in : l) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]==in)
				{
					System.out.println(in+":"+(i));
					break;
				}
			}
				
		}
}
}
