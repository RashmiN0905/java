
abstract class Calculator 
{
	abstract int a=10;

	abstract public int add(int a, int b);

}

class Calci1 extends Calculator
{
	public int add(int a, int b)
	{
		System.out.println(" calculator is passed");
		return a+b;
	}
}

class Driver
{
	public static void main(String[]args)
	{
		Calci1 c = new Calci1();
		System.out.println(c.a);
		c.add(10,20);
	}
}