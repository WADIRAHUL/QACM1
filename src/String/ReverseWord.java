package String;

public class ReverseWord {

	public static void main(String[] args) {
		//HERE WE ARE USING THIRD VARIABLE
		String s = "Rahul";
		String rev = "";
		char[] s2 = s.toCharArray();
		for (char s3 : s2) {
			rev=s3+rev;
		}
		System.out.println(rev);
	}
	/**WITHOUT USING THIRD VARIABLE
	 * String s = "INDIA";
	 * for(int i=s.length()-1;i>=0;i--)
	 * {
	 * 		syso(s.charAt(i));
	 * }
	 */
}
