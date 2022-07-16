package Arrays;

public class IntArryAdd {

	public static void main(String[] args) {

		int a[]= {7,2,4};
		int b[]= {4,5,6,7,7};

		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				int sum=a[i]+b[i];
				if(sum>9)
				{ 
					int dig=sum%10;
					sum=sum/10;
					System.out.println(sum+" "+dig);
				}
				else
				{
					System.out.println(sum);
				}
			}
			catch (Exception e) {

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
