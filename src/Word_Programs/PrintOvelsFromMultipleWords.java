package Word_Programs;

public class PrintOvelsFromMultipleWords {

	public static void main(String[] args) {
		String str[]= {"Pradeep","Santosh","Deepa","Jamuna"};
		
		
		for (int i = 0; i < str.length; i++) {
		String s=str[i];
		s=s.toLowerCase();
		int count=0;
		for (int j = 0; j < s.length(); j++) 
		{
			char s1 = s.charAt(j);
			if(s1=='a' ||s1=='e' || s1=='i' ||s1=='o' || s1=='u')
			{
				count++;
			}
				
		}
		System.out.println(s+":"+count);
		

	}
	}
}
