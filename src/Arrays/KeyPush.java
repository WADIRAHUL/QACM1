package Arrays;

public class KeyPush {
	
	public static void main(String[] args) {
		
		String s="123456";
		
		char[] str = s.toCharArray();
		
		for (int i = 0; i < 2; i++) {
			char ch=str[0];
			for (int j = 1; j <str.length; j++) {
				
				str[j-1]=str[j];
			}
			str[str.length-1]=ch;
		}
		
		String res=String.valueOf(str);
		System.out.println(res);
	}

}
