package String;

public class CaseCount {
	public static void main(String[] args) {
		String s = "Rahul";
		System.out.println(s.length());
		int upCount=0, lowCount=0;
		char[] t = s.toCharArray();
		for (char c : t) {
			if (Character.isUpperCase(c)) {
				System.out.println(c+ " ");
				upCount ++;
			}else {
				System.out.print(c+ " ");
				lowCount ++;
			}
		}
	}
}
