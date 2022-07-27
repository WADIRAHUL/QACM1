package Collections;

import java.util.ArrayList;

class Book
{
	String title;
	Book(){}
	public Book(String title)
	{
		super();
		this.title=title;
	}
	public String toString()
	{
		return " "+title;
	}
}
public class AL3 {

	public static void main(String[] args) {
		ArrayList bag1=new ArrayList();
		
		bag1.add(new Book("Social"));
		bag1.add(new Book("Science"));
		
		System.out.println(bag1.size());
		System.out.println(bag1);
		
		ArrayList bag2=new ArrayList();
		
		bag2.add(new Book("Maths"));
		bag2.add(new Book("History"));
		
		System.out.println(bag2.size());
		System.out.println(bag2);
		
		//to add bag2 using add method
		/*bag1.add(bag2);
		System.out.println(bag1.size());
		System.out.println(bag1);*/
		
		bag1.addAll(bag2);
		System.out.println(bag1.size());
		System.out.println(bag1);		
	}

}
