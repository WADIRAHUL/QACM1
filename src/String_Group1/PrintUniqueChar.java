package String_Group1;

import java.util.LinkedHashSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		String s="BANANA";
		//step1:remove duplicate word//
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for (int i = 0; i<s.length(); i++) 
		{
			l.add(s.charAt(i));
		}
		//step2:compare each word of set with all words from given string
		for (Character str : l) 
		{
			int count=0;
			for (int i = 0; i<s.length(); i++) 
			{
				if(s.charAt(i)==str)
				{
					count++;
				}
			}
			if(count==1)
				System.out.print(str);	
		}
	}
}
