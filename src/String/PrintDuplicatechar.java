package String;

import java.util.HashSet;

public class PrintDuplicatechar {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','a'};
		HashSet<Character> ch=new HashSet<Character>();
		for (int i = 0; i < a.length; i++) {
			ch.add(a[i]);
		}
		System.out.println(ch);
		for ( Character c : ch) 
		{
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==c)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("count for duplicate  " +c+"="+count);
		}
		}
			
	}
}
