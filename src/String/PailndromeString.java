package String;

public class PailndromeString {
	public static void main(String[] args) {
		String s = "pop";
		String temp = s;
		String rev = "";
		char[] s1 = s.toCharArray();
		for (char c : s1) {
			rev = c+rev;
		}
		System.out.println(rev);
		if (temp.equals(rev)) {
			System.out.println("The Given String Is Pailndrome");
		} else {
			System.out.println("The Given String Is Not Pailndrome");
		}
	}
}
