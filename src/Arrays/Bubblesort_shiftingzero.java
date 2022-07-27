package Arrays;

public class Bubblesort_shiftingzero {

	public static void main(String[] args) {
		int a[]= {0,0,3,4,5,0};
		int b[]= new int[a.length];
		int i = 0;
		int k=0;
		for (int j=b.length-1; i < b.length; i++) {
			if(a[i]!=0)
			{
				b[k]=a[i];
				k++;
			}
			else {
				b[j]=a[i];
				j--;
			}
		}
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
