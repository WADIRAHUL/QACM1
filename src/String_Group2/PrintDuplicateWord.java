package String_Group2;

import java.util.LinkedHashSet;

public class PrintDuplicateWord {

	public static void main(String[] args) {
		String s="welcome to india tyss welcome to";
		String[] str = s.split(" ");
		//step1:remove duplicate word//
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		//step2:compare each word of set with all words from given string
		for (String word : set) 
		{
			int count=0;
			for (int i= 0; i<str.length; i++) 
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)
				System.out.print(word+" ");	
		}
	}
}
