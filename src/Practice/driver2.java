package Practice;

	class  Mobile
	{
		int ram;
		String brand;
		double price;

		Mobile(){}
		Mobile(int ram,String brand,double price)
		{
			this.ram=ram;
			this.brand=brand;
			this.price=price;
		}
		//to over ride toString()
		public String toString()
		{
			System.out.println("Ram size is: "+ram);
			System.out.println("Mobile brand is: "+brand);
			System.out.println("Mobile Price is: "+price);
			return"";
		}
		//to over ride equals()
		public boolean equals(Object o)
		{
			Mobile m=(Mobile)o;
			return this.ram==m.ram &&
				   this.brand==m.brand &&
				   this.price==m.price;
		}
	}

	class Driver2
	{
		public static void main(String[] args)
		{
			Mobile m1=new Mobile(4,"Samsung",20000);
			Mobile m2=new Mobile(4,"Samsung",20000);
			System.out.println(m1);
			System.out.println(m2);
			if(m1.equals(m2))
				System.out.println("Similar Configuration");
			else
				System.out.println("Different Configuration");
		}
	}

