package String;

public class FindingVowels {
	public static void main(String args[]) {
		String s = "INDIA";
		String str = s.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int count=0;
			if(ch =='a'|| ch =='e'|| ch =='i' || ch =='o' || ch =='u') {
				count++;
				System.out.println(ch+" "+count);
			}
		}
	}
}

