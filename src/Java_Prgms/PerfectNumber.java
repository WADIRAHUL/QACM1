package Java_Prgms;

public class PerfectNumber {
	public static void main(String[] args) {
		int num=6, sum=0, temp=num;
		for(int i=1; i<=num/2; i++)
		{
			if (num%i==0) {
				sum = sum + i;
			}
		}
		if (sum==temp) {
			System.out.println("The Given Number Is Perfect Number");
		}else {
			System.out.println("The Given Number Is Not Perfect Number");
		}
	}
}
