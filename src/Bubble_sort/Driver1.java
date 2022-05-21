package Bubble_sort;

	import java.util.Arrays;

	class Driver1
	{
		public static void main(String[] args)
		{
			//to store 5 employee details
			Employee[] e=new Employee[5];
			e[0]=new Employee(5,"Smith",10000);
			e[1]=new Employee(3,"Miller",12000);
			e[2]=new Employee(4,"John",15000);
			e[3]=new Employee(1,"Adams",20000);
			e[4]=new Employee(2,"Allen",25000);
			System.out.println("Before Sorting");
			for (int i=0;i<e.length ;i++ )
			{
				System.out.println(e[i]);
			}
			Arrays.sort(e);
			System.out.println("After Sorting");
			for (int i=0;i<e.length ;i++ )
			{
				System.out.println(e[i]);
			}
		}
	}
 