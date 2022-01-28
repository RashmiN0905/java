class Parent 
{
	public  void Man() 
	{
		System.out.println("Hello");
	}

	public  void Man(int a) 
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
	public void Man(char c) 
	{
		System.out.println("Hello Man");
	}

	public void Man(float a) 
	{
		System.out.println("World Map");
	}

	public void Man(int a, int b) 
	{
		System.out.println("Hello keeks");
	}
}