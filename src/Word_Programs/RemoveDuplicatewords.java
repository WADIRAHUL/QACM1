package Word_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatewords {

	public static void main(String[] args) {
		String s="welcome to india tyss welcome to";
		String[] str = s.split(" ");
		//step1:remove duplicate word//

		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		//step2:compare each word of set with all words from given string
		for (String word : set) 
		{
			System.out.print(word+" ");	
		}
	}
}


