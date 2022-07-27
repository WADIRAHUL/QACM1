package Word_Programs;

public class ShiftILastWordToFirst {

	public static void main(String[] args) {
	String s="how are you";//s=you how are
	String[] str = s.split(" ");
	int key=2;
	for (int k = 0; k < key; k++) 
	{
		String temp = str[str.length-1];//you
		for (int i = str.length-1; i  >0; i--) 
		{
			str[i]=str[i-1];//howare
		}
		str[0]=temp;//you
	}
	for (int i = 0; i < str.length; i++) 
	{
		System.out.print(str[i]+" ");
	}

}

}
