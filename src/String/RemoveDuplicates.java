package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="BANANA";
		char[] s1 = s.toCharArray();
		
		List<Character> list = new ArrayList<>();
		for (Character c : s1) {
			list.add(c);
		}
		Set<Character> set = new HashSet<>(list);
		System.out.println(set);
	}
}
