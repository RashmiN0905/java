class Book 
{
	private int book_id;
	private String title;
	private  double price;


	public int getBook_id()
	{
		return book_id;
	}

	public String getTitle()
	{
		return title;
	}

	public void SetTiltle(String title)
	{
		this.title=title;
	}

	public double getPrice()
	{
		return price;
	}

	public void SetPrice(double price)
	{
		this.price=price;
	}

	Book()
	{
	}

	Book(int book_id)
	{
		this. book_id=  book_id;
	}

	Book( int book_id,String title)
	{
		this(book_id);
		this.title=  title;
	}
	Book (int book_id,String title, double price)
	{
		this(book_id,title);
		this.price=price;
		System.out.println("Book id : "+ book_id);
		System.out.println("Book title : "+ title);
		System.out.println("Book price: "+ price);
	}
	public static void main(String[] args) 
	{
		Book B = new Book(23,"Mathematics", 1200.25);

		/B.setTitle("English");
		//B.SetPrice(1235);


	}
}
