package Java_Prgms;

public class Pailndrome {
	public static void main(String[] args) {
		int num = 121, rev = 0;
		int temp = num;
		while(num>0) {
			int rem = num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		if (temp==rev) {
			System.out.println("The Given Number is Pailndrome");
		} else {
			System.out.println("The Given Number is Not Pailndrome");
		}
		
		
	}
}
