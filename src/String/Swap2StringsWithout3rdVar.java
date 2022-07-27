package String;

public class Swap2StringsWithout3rdVar {

	public static void main(String[] args) {
		String s1="java";	 	//4
		String s2="selenium";	//8
		s1=s1+""+s2;//javaselenium //12
		System.out.println(s1);
		s2=s1.substring(0, s1.length()-s2.length());//(12-8=4)
		s1=s1.substring(s2.length());//4=s
		System.out.println(s1+" "+s2);
	}
}
