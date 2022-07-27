package Arrays;

public class Bubblesort_shiftingzero2ndmthd {

	public static void main(String[] args) {
		int a[]= {0,2,5,0,6,0,3};
		int b[]= new int[a.length];
		int m=a.length-1;
		int n=0;
		for (int i=0; i < a.length; i++) {
			if(a[i]==0)
			{
				b[n]=a[i];
				n++;
			}
			else {
				b[m]=a[i];
				m--;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
