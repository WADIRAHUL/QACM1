package Arrays;

public class MaximumNum_Without_Using_Bubblesort {

	public static void main(String[] args) {
		int a[] = {40, 30, 50, 20, 10};
		int fMax = a[0], sMax = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(fMax<a[i])
			{
				sMax = fMax;
				fMax = a[i];
			}else if (sMax<a[i]) {
				sMax = a[i];
			}
		}
		System.out.println(sMax);		
		System.out.println(fMax);		
	}
}
