class Book 
{
	String  bookTitle;
	double price;

	Book()
	{
	}

	Book(String bookTitle,double price)
	{
		this.bookTitle=bookTitle;
	    this.price=price;
	}


	public void getBookdetails() 
	{
		System.out.println(" Title of the book is : "+bookTitle);
		System.out.println(" Price of the book is : "+price);
	}
}

class Bag
{
	Book b;
	String colour;
	double price;

	Bag()
	{
	}

	Bag(String colour,double price)
	{
		this.colour=colour;
	    this.price=price;
	}

	public void storeBook(Book b) 
	{
		this.b= b;
		System.out.println("Storing the book");
		
	}

	public void removeBook(Book b) 
	{
		this.b=null;
		System.out.println("Removing the book");
		
	}


	public void getBagdetails() 
	{
		System.out.println(" colour of the bag is : "+colour);
		System.out.println(" Price of the bag is : "+price);
	}


}

class Driver
{
	public static void main(String[]args)
	{
		Bag b1 = new Bag("Black", 2300.00);
		b1.getBagdetails();
		b1.storeBook(new Book("Hundred lies", 500.00));
		b1.b.getBookdetails();
	}
}
