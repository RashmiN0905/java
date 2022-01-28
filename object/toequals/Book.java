class  Book
{
	String name;
	Book(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{

		Book b1= new Book(" Girl in the Train");
		Book b2=b1;
		Book b3= new Book(" Girl in the City");
		System.out.println(b1.name);
		System.out.println(b2.name);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		System.out.println(b1.equals(b3));
		System.out.println(b1==b3);
	}
}


class  Book1
{
	String name;
	Book1(String name)
	{
		this.name=name;
	}

	public boolean equals(Object o)
	{
		Book1 b = (Book1)o;

		if(this.name==b.name)
		return true;
		else
		return false;
	}
	public static void main(String[] args) 
	{

		Book1 b1= new Book1(" Girl in the Train");
		Book1 b2=b1;
		Book1 b3= new Book1(" Girl in the City");
		System.out.println(b1.name);
		System.out.println(b2.name);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		System.out.println(b1.equals(b3));
		System.out.println(b1==b3);
	}
}



