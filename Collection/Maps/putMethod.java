import java.util.*;
class putMethod 
{
	public static void main(String[] args) 
	{
		HashMap h1= new HashMap();
		h1.put(1, "Amay ");
		h1.put(2, "Anoop");
		h1.put(3, "Arha");
		h1.put(4, "Alap");
		h1.put(5, "Amay");
	    h1.put(null, "Abhi");
		h1.put(6, null);
		h1.put(	null, null);
		System.out.println(h1);
		System.out.println("****************************");
		Set h2 = h1.keySet();
		System.out.println(h2);

		System.out.println("****************************");
		Map h4 = h1.values();
		System.out.println(h4);//COLLECTIONS CANNOT BE CONVERTED INTO MAP

		System.out.println("****************************");
		Collection h3 = h1.values();
		System.out.println(h3);


		System.out.println("****************************");
		ArrayList h4 = h1.values();
		System.out.println(h4);//COLLECTIONS CANNOT BE CONVERTED INTO MAP
	}
}
