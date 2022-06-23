package Java_Prgms;

public class Prime_Array {

	public static void main(String[] args) {
		int count=0;
		int [] a = {10, 13, 15, 19};
		for(int i=0; i<a.length; i++)
		{
			int num = a[i];
			for(int j=2; j<num; j++) 
			{
				System.out.println(num);
				if (num%j==0) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println("The Number "+num+" is Prime");
			}else {
				System.out.println("The number not a prime number");
			}
		}
	}
}
