package String;

public class CaseCount {
	public static void main(String[] args) {
		String s = "Rahul";
		System.out.println(s.length());
		char[] t = s.toCharArray();
		for (char c : t) {
			if (Character.isUpperCase(c)) {
				System.out.println(c+ " ");
			}else {
				System.out.print(c+ " ");
			}
		}
	}
}
