import java.util.*;
class Fruits
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		ArrayList l= new ArrayList();
		l.add("Mango");
		l.add("Apple");
		l.add("Orange");
		l.add("Grapes");

		Object s =Sc.next().trim();
		
		System.out.println(l);

		if(l.contains(s))
		{
			System.out.println("Yes..... it is present");
		}
		else
		{
		System.out.println("No..... it is present");
		}
	}
}


class FruitIndex
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		ArrayList l= new ArrayList();
		l.add("Mango");
		l.add("Apple");
		l.add("Orange");
		l.add("Grapes");

		Object s =Sc.next().trim();
		
		System.out.println(l);

		if(l.contains(s))
		{
			System.out.println(l.indexOf(s)+ " is the index of the fruit");
		}
		else
		{
		System.out.println("No..... it is not present");
		System.out.println(l.indexOf(s));
		}

		for(Object o: l)
		{
		System.out.println(l);
		}
	}
}
