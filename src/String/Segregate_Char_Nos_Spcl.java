package String;

public class Segregate_Char_Nos_Spcl {

	public static void main(String[] args) {
		String s="hgfghf12345#$&^";
		String alph="";
		String num="";
		String spch="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') 
			{
				alph=alph+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
			else
			{
				spch=spch+ch;
			}
		}
		System.out.println("Alphbets= "+alph);
		System.out.println("Numbers= "+num);
		System.out.println("Special characters= "+spch);
	}
}
