import java.util.*;
class clear
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
		System.out.println("before clear");
		System.out.println(l);
		l.clear();
		System.out.println("after clear");
		System.out.println(l);

	}
}
