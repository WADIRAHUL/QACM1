package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class prime {
	public static ArrayList Prime(int ll,int ul)
	{
		ArrayList ls=new ArrayList();
		int i=2;
		int count=0;
		while(i<ul)
		{
			if (ul%i==0)
			{
				count ++;
			}
			i++;
		}
		if (count==0)
	    {
	    	ls.add(i);
	    }
	    else
	    {
	    	System.out.println("No prime numbers");
	    }
		return ls;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower Limit");
		int a=s.nextInt();
		System.out.println("Enter the Upper Limit");
		int b=s.nextInt();
		System.out.println(Prime(a,b));
	}

}
