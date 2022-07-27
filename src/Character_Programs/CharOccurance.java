 package Character_Programs;

public class CharOccurance {

	public static void main(String[] args) {
		String s = "wwwwaabbccwabc";
		for (int i = 0; i < s.length(); i++) {
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
					i++;//in order to avoid repetition of the same char
				}else {
					break;
				}
			}
			System.out.println(s.charAt(i)+" "+count);
		}
	}
}
