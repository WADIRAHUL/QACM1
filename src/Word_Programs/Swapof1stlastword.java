package Word_Programs;

public class Swapof1stlastword {

	public static void main(String[] args) {
		String s="Welcome to TYSS bangalore";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		//Step1: remove the duplicate
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i =0; i <str.length ; i++) 
		{
			System.out.print(str[i]+" ");
			
			
		}

	}

}
