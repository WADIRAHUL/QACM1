package String_Group2;

import java.util.LinkedHashSet;

public class Word_Position {

	public static void main(String[] args) {
		String s="welcome to india to goa";
		String[] str = s.split(" ");
		//step1:remove duplicate word//
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		//step2:compare each word of set with all words from given string
		for (String word : set) 
		{
			for (int i=0; i<str.length; i++) 
			{
				if(word.equals(str[i]))
				{
					System.out.println(word+" "+(i+1));
					break;
				}
			}
		}
	}
}
