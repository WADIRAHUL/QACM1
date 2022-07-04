package String;

public class Adding_Char {

	public static void main(String[] args) {
		String s = "RAHUL";
		String add = "";
		for (int i = 0; i < s.length(); i++) {
			add = add+s.charAt(i);
			System.out.println(add);
		}
	}
}
