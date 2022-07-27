package Arrays;

public class PrintGreaterNumber {

	public static void main(String[] args) {
		int []a= {14, 11, 8, 5,3,15};

		for (int i = 0; i <a.length; i=i+2) {
			try {	
				if (a[i]>a[i+1]) {
					System.out.print(a[i]+" ");
				}else {
					System.out.print(a[i+1]+" ");
				}
			}
			catch (Exception e) {
				System.out.print(a[a.length-1]);
			}
		}
	}
}
