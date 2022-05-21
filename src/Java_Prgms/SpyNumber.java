package Java_Prgms;

public class SpyNumber {
	public static void main(String[] args) {
		int num=123, sum=0, prod=1;
		while (num>0) {
			int rem = num%10;
			sum = sum + rem;
			prod = prod * rem;
			num = num / 10;
		}
		if (sum==prod) {
			System.out.println("The Given Number is Spy Number");
		}else {
			System.out.println("The Given Number is Not Spy Number");
		}
	}
}
