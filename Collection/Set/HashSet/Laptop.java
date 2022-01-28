import java.util.*;
class Laptop implements Comparable
	 {

		int id;
		double price;
		String ram;

		Scanner Sc = new Scanner(System.in);
	
		Laptop(int id, double price, String ram)
		 {
			this.id=id;
			this.price=price;
			this.ram=ram;
		}
		public int compareTo(Object o)
		{
		Laptop a = (Laptop)o;
		return (int)( this.price-a.price);
		}

	public void display()
	{
	System.out.println("Price "+price );
	System.out.println("id "+id );
	System.out.println("Ram "+ram );
	}

	public static void main(String[] args) 
		{
		
		TreeSet t = new TreeSet();

		t.add(new Laptop(123, 10000.00, "2GB"));
		t.add(new Laptop(456, 20000.00, "4GB"));
		t.add(new Laptop(180, 50000.00, "6GB"));

		
for(Object o : t)
{
	((Laptop)o).display();
}
		}

ListIterator i = t.listIterator();

while(i.hasPrevious)
		 {
		System.out.println(i.preivous());
		 }
	}

