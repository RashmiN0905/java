package pack2;
import pack1.Bike;
public class Cart extends Bike 
{

	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		System.out.println(b1.c);
		Cart l=new Cart();
		System.out.println(l.d);
	}
}