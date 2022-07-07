package Arrays;

public class Minimum_Without_Using_Bubblesort {

	public static void main(String[] args) {
		int a[] = {40, 30, 50, 20, 10};
		int fMin = a[0], sMin = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(fMin>a[i])
			{
				sMin = fMin;
				fMin = a[i];
			}else if (sMin>a[i]) {
				sMin = a[i];
			}
		}
		System.out.println(fMin);
		System.out.println(sMin);				
	}
}
