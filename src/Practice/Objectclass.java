package Practice;


class  Book
{
	int pages;
	String name;
	double price;

	Book(){}
	Book(int pages,String name,double price)
	{
		this.pages=pages;
		this.name=name;
		this.price=price;
	}
	//to over ride toString()
	public String toString()
	{
		System.out.println("Book pages are: "+pages);
		System.out.println("Book name is: "+name);
		System.out.println("Book Price is: "+price);
		return"";
	}
	//to over ride equals()
	public boolean equals(Object o)
	{
		Book b=(Book)o;
		return this.pages==b.pages &&
				this.name==b.name &&
				this.price==b.price;
	}
	public int hashcode()
	{
		int hc=0;
		hc=hc+pages;
		hc=(int) (hc+price);
		hc=hc+name.hashCode();
		return hc;
	}
}

class Objectclass
{
	public static void main(String[] args)
	{
		Book b1=new Book(400,"SonaRoopa",80);
		Book b2=new Book(400,"SonaRoopa",80);
		System.out.println(b1);
		System.out.println(b2);
		if(b1.equals(b2))
			System.out.println("Similar configuration");
		else
			System.out.println("Different configuration");
		System.out.println(b1.hashcode()==b2.hashcode());
		System.out.println(b1.hashcode());
		System.out.println(b2.hashcode());
	}
}




