import java.util.*;
class Iterators
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(70);


		ListIterator i = l.listIterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
			i.remove();
		}

       System.out.println("============================");

		while(i.hasPrevious())
		{
			System.out.println(i.previous());
			//i.remove();
		}
		
	}
}
