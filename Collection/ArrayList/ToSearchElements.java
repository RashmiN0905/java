import java.util.*;
class ToSearchElements 
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(70);
		Object a=30;
		System.out.println("before clear");
		System.out.println(l);

		ArrayList l1= new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(l);

		System.out.println("index of the a is "+ l.indexOf(a));
		System.out.println("is l1 Contains l "+ l1.contains(l));
		System.out.println("is l ContainsAll elements of l1 "+ l.contains(l1));
	}
}
