package String;

public class Reverse_Sentence {

	public static void main(String[] args) {
		String s = "Welcome To Bangalore To  Welcome";
		 String [] s1 = s.split(" "); 
		 for (int i = s1.length-1; i >=0 ; i--) 
		 {
			 System.out.print(s1[i]+" "); 
		 }
		 
//		String  str[]=s.split(" ");
//		for (int i = 0; i < str.length; i++) {
//			int count=0;
//			for (int j = 0; j < str.length; j++) {
//				
//				if(str[i].equals(str[j]))
//				{
//					count++;
//				}
//			}
//			if(count==1)
//			{
//				System.out.println(str[i]);
//			}
//		}
	}
}
