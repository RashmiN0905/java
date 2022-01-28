class Book2
{

	String name;
	String author;
	int price;

  Book1()
	{
	}

	public static void main(String[] args) 
	{
		Book2 B1= new Book2();
		B1.name="Mathematics";
		B1.author = "shastri";
		B1.price = 1400;

		System.out.println(B1.name);
		System.out.println(B1.author);
		System.out.println(B1.price);
	}
}