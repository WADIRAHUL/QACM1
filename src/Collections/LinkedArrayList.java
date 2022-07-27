package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedArrayList {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Js");
		list.add(2019);
		list.add('s');
		list.add(null);
		ArrayList<Object> list1=new ArrayList<Object>();
		list1.add(19);
		list1.add("deep");
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("Js"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(18);
		list3.add(26);
		list3.add(9);
		Collections.sort(list3);
		for (Integer it : list3) {
			System.out.println(it);
			
		}
	}
}
