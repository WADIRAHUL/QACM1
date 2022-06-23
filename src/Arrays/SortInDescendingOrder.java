package Arrays;

public class SortInDescendingOrder {
	public static void main(String[] args) {
		int[] a = {40, 50, 10, 20, 30};
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1 ; j<a.length;j++) 
			{
				if (a[i]<a[j]) 
				{
					int rep = a[i];
					a[i]=a[j];
					a[j]=rep;
				}
			}
		System.out.print(a[i]+" ");
		}
	}
}
