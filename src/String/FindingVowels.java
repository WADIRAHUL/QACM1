package String;

public class FindingVowels {
	public static void main(String args[]) {
		String s = "INDIA";
		String str = s.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='a'|| ch =='e'|| ch =='i' || ch =='o' || ch =='u') {
				System.out.println(ch);
			}
		}
	}
}

