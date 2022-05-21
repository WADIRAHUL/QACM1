package String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Rahul";
		String rev = "";
		char[] s2 = s.toCharArray();
		for (char s3 : s2) {
			rev=s3+rev;
		}
		System.out.println(rev);
	}

}
