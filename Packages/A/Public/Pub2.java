package pubPack2;
import pubPack3.Pub1;
public class Pub2
{

	public static void main(String[] args) 
	{
		Pub1 p1 = new Pub1();
		System.out.println(p1.a);
		System.out.println(p1.b);
		p1.m1();
	}
}