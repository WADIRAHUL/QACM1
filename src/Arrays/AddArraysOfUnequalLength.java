package Arrays;

public class AddArraysOfUnequalLength {

	public static void main(String[] args) {
		int[]a= {4,5,1,2,8};
		int[]b= {3,1,2,3};
		int count = a.length;
		if(a.length<b.length)
		{
			count = b.length;
		}
		for(int i=0;i<count;i++)
		{
			try
			{
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) 
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else 
				{
					System.out.println(b[i]);
				}
			}
		}
	}
}

