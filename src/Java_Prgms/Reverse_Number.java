package Java_Prgms;

public class Reverse_Number {

	public static void main(String[] args) {
		int num = 123456;

		while(num>0)
		{
			int rem = num%10;
			System.out.print(rem+" ");
			num=num/10;
		}
	}
}
