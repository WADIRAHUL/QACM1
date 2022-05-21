package Java_Prgms;

public class NeonNumber {
	public static void main(String[] args) {
		int num=9, sum=0;
		int sq = num * num;
		while (sq>0) {
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}
		if (sum==num) {
			System.out.println("The Given Number Is Neon Number");
		} else {
			System.out.println("The Given Number Is Not Neon Number");
		}
	}
}
