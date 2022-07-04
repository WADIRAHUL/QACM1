package String_Group1;

import java.util.LinkedHashSet;

public class Character_Count {

	public static void main(String[] args) {
		String s = "BANANA";
		//step1:remove duplicate word & it maintain the insertion order
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each word of set with all characters from given string
		for (Character str : set)
		{
			int count=0;
			for (int i=0; i<s.length(); i++) 
			{
				if(str==s.charAt(i))
				{
					count++;
				}
			}
			//TO PRINT BOTH CHRACTER & COUNT
			System.out.print(str+"="+count+" ");	
		}
	}
}
