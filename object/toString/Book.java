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
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
	}
}



//}
