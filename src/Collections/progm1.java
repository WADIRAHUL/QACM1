package Collections;

public class progm1 {
	public static void main(String[]args)
	{
		int[] a= {0,2,12,45,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);

		}
	}

}
