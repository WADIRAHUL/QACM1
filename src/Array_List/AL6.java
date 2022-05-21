package Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class AL6 {

	public static void main(String[] args) {
		
				ArrayList al=new ArrayList();
				al.add(10);
				al.add(20);
				al.add(40);
				al.add(60);
				System.out.println(al);
				Iterator i=al.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				Iterator i1=al.iterator();
				while (i1.hasNext()) {
					System.out.println(i1.next());
				}
				/*System.out.println(i.next());//CTE*/
			}
		}

