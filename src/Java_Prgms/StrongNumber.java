
package Java_Prgms;

public class StrongNumber {
	public static void main(String[] args) {
		int num=145, sum=0, temp=num;
		while (num>0) {
			int rem = num % 10;
			int fact=1;
			while (rem>0) {
				fact = fact * rem--;
			}
			sum = sum + fact;
			num = num / 10;
		}
		if (sum==temp) {
			System.out.println("The Given Number is Strong Number");
		} else {
			System.out.println("The Given Number is Not Strong Number");
		}
	}
}
