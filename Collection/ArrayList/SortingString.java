import java.util.*;
class SortingString 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		/*l1.add("sheela");
		l1.add("laila");
		l1.add("mala");
		l1.add("dinga");*/

		l1.add("Rashmi");
		l1.add(" N");
		l1.add(" Nagaraj");
		System.out.println("Before Sorting");
		System.out.println(l1 );//[Rashmi,  N,  Nagaraj]//--------> it will sort according to the First alphabet of the String
		
		Collections.sort(l1);
		System.out.println("After Sorting  shows in Ascending order");
		System.out.println(l1);// [ N,  Nagaraj, Rashmi]

		Collections.reverse(l1);
		System.out.println("After Reversing  shows in Descending order");
		System.out.println(l1);//	[Rashmi,  Nagaraj,  N]

	}
}
