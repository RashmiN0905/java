import java.util.*;
class Sorting 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(50);
		l1.add(5);
		l1.add(30);
		System.out.println("Before Sorting");
		System.out.println(l1 );
		
		Collections.sort(l1);
		System.out.println("After Sorting  shows in Ascending order");
		System.out.println(l1);

		Collections.reverse(l1);
		System.out.println("After Reversing  shows in Descending order");
		System.out.println(l1);


	}
}
