package Arrays;

public class MinLengthOfStringIn_Array {
	public static void main(String[] args) {
		String S[] = {"bye", "who", "hi","to", "amma"};
		String min = S[0];// is the assumption
		for ( int i=1; i<S.length; i++)
		{
			if (min.length()>S[i].length())
			{				
				min = S[i];
			}
		}
		for (int i=0; i<S.length; i++)
		{
			if (min.length()==S[i].length())
			{
				System.out.println(S[i]);
			}
		}		
	}
}

