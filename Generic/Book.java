import java.util.*;
class  Book //Non generic
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		int sum=0;

		for(Object o: a)
		{
		int a1 = (int)o;
		sum=sum+a1;
		
		}
System.out.println(sum);
	
	}
}
 

 // GENERIC

 class  Book1 //Non generic
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		int sum=0;

		for(Object o: a)// Integer to Object upcasting
		{
		int a1 = (Integer)o;// Object to Integer  downcasting
		sum=sum+a1;
		}
		System.out.println(o);
	
	}
}

class Book
{
}