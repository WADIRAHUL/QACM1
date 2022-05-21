package String;

public class Replace {
	public static void main(String[] args) {
		String s = "This is Selenium Testing";
		System.out.println("Original String is: "+s);
		String replace = s.replace('e', 'i');
		System.out.println("Modified string is: "+replace);
	}
}
