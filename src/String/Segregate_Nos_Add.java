package String;

public class Segregate_Nos_Add {

	public static void main(String[] args) {
		String s="hgfghf12345#$&^";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) 
		{			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;//ASCII value of 1 is 49 so 
				System.out.print(n+" ");
				sum = sum + n;
			}
		}
		System.out.println("SUM of all numbers = "+sum);
	}
}
