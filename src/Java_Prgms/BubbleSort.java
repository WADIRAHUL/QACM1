package Java_Prgms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {40, 50, 100, 30};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1 ; j<a.length;j++) {
				if (a[i]>a[j]) {
					int rep = a[i];
					a[i]=a[j];
					a[j]=rep;
				}
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
