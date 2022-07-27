package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class even {
	public static ArrayList Even(int ll,int ul)
	{
		ArrayList ls=new ArrayList();
		
		for ( int i=ll; i<=ul; i++)
		{
			if(i%2==0)
				ls.add(i);
		}
		return ls;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower Limit");
		int a=s.nextInt();
		System.out.println("Enter the Upper Limit");
		int b=s.nextInt();
		System.out.println(Even(a,b));
	}

}
