package String_Group1;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="welcome";
		//step1:remove duplicate char
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for (int i = 0; i<s.length(); i++) {
			l.add(s.charAt(i));
		}
		for (Character ch : l) {
			System.out.print(ch+" ");	
		}
	}
}


