import java.util.*;
class GenericTree 
{
	/*	public int compareTo(Object o)
		{
			GenericTree g1 =(GenericTree)o;
			return (this.key-g1.key);
		}*/
		
	public static void main(String[] args) 
	{
		TreeMap <Integer , String> t1= new <Integer ,String>TreeMap();
		t1.put(2, "Jan");
		t1.put(4, "Feb");
		t1.put(1, "Mar");
		t1.put(5, "Apr");
		t1.put(3, "May");
		//t1.put(null, "May");//.NullPointerException
		t1.put(6, null);
		//t1.put(null, null);//.NullPointerException


		System.out.println(t1);
	}
}
