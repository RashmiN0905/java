import java.util.*;
class removeElements 
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(70);
		System.out.println("before removing");
		System.out.println(l);
		l.remove(1);
		System.out.println("after removing");
		System.out.println(l);


		ArrayList l1= new ArrayList();
		l1.add(60);
		l1.add(120);
		l1.add(180);
		l1.add(300);
		Integer i=400;
		l1.add(i);
		l1.addAll(l);
		System.out.println("before removing");
		System.out.println(l1);
		System.out.println(l1.removeAll(l));
		System.out.println("after removing");
		System.out.println(l1);
		
	}
}
