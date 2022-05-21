package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCount {
	public static void main(String[] args) {
		String s = "BANANA";
		char[] s1 = s.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		for (char c : s1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (java.util.Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}
}