class Book3
{

	String name;
	String author;
	int price;

	{
	System.out.println("my name is RASHMI");
	}

  Book3()
	{
	  System.out.println("second name");
	}

	public void display()
	{
	System.out.println(name);
		System.out.println(author);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		Book3 B1= new Book3();
		B1.name="Mathematics";
		B1.author = "shastri";
		B1.price = 1400;

		B1.display();

		
	}
}