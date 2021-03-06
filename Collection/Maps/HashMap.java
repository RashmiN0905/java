import java.util.*;
class Book implements Comparable 
{
		Author a;
		int bid;
		String title;
		String author;

	public int compareTo(Object o)
	{
		Book b1=(Book)o;
		return (this.bid-b1.bid);
	}
	public String toString()
	{
		return "----bid = " +bid +"------ title = "+title +"----author = " +author;
	}
	Book(int bid, String title, String author)
	{
		this.bid=bid;
		this.title=title;
		this.author=author;
	}

}

class Author 
{
		int houseNo;
		String name;
		String address;

	public String toString()
	{
		return "-----houseNo = " +houseNo+"----- name = "+name +"---address = "+address;
	}
	Author(int houseNo, String name, String address)
	{
		this.houseNo=houseNo;
		this.name=name;
		this.address=address;
	}
}

class Driver
{
	public static void main(String[]args)
	{

		LinkedHashMap<Book, Author> t2 = new <Book, Author> LinkedHashMap();
		
		t2.put(new Book(12, "My life Secret", " Sudeep NAgarkar"), new Author( 23, " Nagarkar", " Bangalore"));
		t2.put(new Book(14, " Secret", " Ravindranath"), new Author( 25, " Tagore", " Bengal"));
		t2.put(new Book(13, "Girl in the train", " Balaji"), new Author( 27, " Melmane", " Mysore"));
		t2.put(new Book(11, "Sad truth", " kavitha"), new Author( 27, " Nagaran", " Badami"));
		t2.put(new Book(11, "Sad truth", " kavitha"),null);
		t2.put(null,null);
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(t2);
		System.out.println("----------------------------------------------------------------------------------------------");
		Collection c2=t2.values();
		System.out.println(c2);
		System.out.println("----------------------------------------------------------------------------------------------");
		Collection d2=t2.keySet();
		System.out.println(d2);
		System.out.println("----------------------------------------------------------------------------------------------");



		HashMap<Book, Author> t1 = new HashMap <Book, Author>(t2);
		t1.put(new Book(12, "My life Secret", " Sudeep NAgarkar"), new Author( 23, " Nagarkar", " Bangalore"));
		t1.put(new Book(14, " Secret", " Ravindranath"), new Author( 25, " Tagore", " Bengal"));
		t1.put(new Book(13, "Girl in the train", " Balaji"), new Author( 27, " Melmane", " Mysore"));
		t1.put(new Book(11, "Sad truth", " kavitha"), new Author( 27, " Nagaran", " Badami"));
		t1.put(null,null);
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(t1);
		System.out.println("----------------------------------------------------------------------------------------------");
		Collection c1=t1.values();
		System.out.println(c1);
		System.out.println("----------------------------------------------------------------------------------------------");
		Collection d1=t1.keySet();
		System.out.println(d1);
		System.out.println("----------------------------------------------------------------------------------------------");
		



	}

}