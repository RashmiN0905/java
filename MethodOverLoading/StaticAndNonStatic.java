class Parent 
{
	public static void Man() 
	{
		System.out.println("Hello");
	}

	public static void Man(int a) 
	{
		System.out.println("World!");
	}

	public  void Man(int a, float k) 
	{
		System.out.println("Hello World!");
	}
}

class Child extends Parent 
{
	public static void Man(char c) 
	{
		System.out.println("Hello Man");
	}

	public  void Man(float a) 
	{
		System.out.println("World Map");
	}

	public static void Man(int a, int b) 
	{
		System.out.println("Hello keeks");
	}
}
class Driver
{
	public static void main(String[]args) 
	{
	Child c = new Child();
	c.Man();
	c.Man(10);
	c.Man('A');
	c.Man(10, 8);
	c.Man( 8, 8.88f);
	}	
}