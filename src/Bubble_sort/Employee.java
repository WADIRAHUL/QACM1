package Bubble_sort;

	public class  Employee implements Comparable
	{
		int eid;
		String name;
		double sal;

		Employee(){}
		Employee(int eid,String name,double sal)
		{
			this.eid=eid;
			this.name=name;
			this.sal=sal;
		}
		public String toString()
		{
			return name+"= "+eid+" ";
		}
		public int compareTo(Object o)
		{		
			Employee e1=(Employee)o;
			if(this.eid>e1.eid)
				return 1;
			else if(this.eid==e1.eid)
				return 0;
			else
				return -1;
		}
		/*public int compareTo(Object o)
		{
			return this.name.compareTo(((Employee)o).name);
		}*/
	}
