class Pen 
{
	double price;
	Pen(double price)
	{
		this.price=price;
	}
	@Override
		public int hashCode()
	{
		int hc = (int)price;
		return hc;
	}
	public static void main(String[] args) 
	{
		Pen p = new Pen(9.25);
		System.out.println(p);
	}
}


class Book
{
	int bid;
	double price;
	Book(int bid, double price)
	{
		this.bid=bid;
		this.price=price;
	}

	@Override
		public int hashCode()
	{
		int hc1=bid;
		double hc2 = price;
		int hc = hc1+(int)hc2;
		return hc;
	}
	public static void main(String[] args) 
	{
		Book b1 = new Book(4, 20.25);
		System.out.println(b1);
	}
}


class Book1
{
	String bname;
	Book1(String bname)
	{
		this.bname=bname;
	}
	public static void main(String[] args) 
	{
		Book1 b1 = new Book1(" My name");
		Book1 b2=b1;
		System.out.println(b1.bname);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		int h1=b1.hashCode();
		int h2=b2.hashCode();
		System.out.println(h1==h2);
	}
}


class Book2
{
	String bname;
	Book2(String bname)
	{
		this.bname=bname;
	}
	public static void main(String[] args) 
	{
		Book2 b1 = new Book2(" My name");
		Book2 b2=new Book2(" Your name");;
		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		int h1=b1.hashCode();
		int h2=b2.hashCode();
		System.out.println(h1==h2);
	}
}
