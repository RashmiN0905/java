class A 
{
	static int a1=10;
	int b;

static
	{
	int a1=50;
	}
	{
		int b=50;
	}
	public static void name()
	{
		//static int c1=9;
		int c=1;
	System.out.println("Hello!");
	}
	public void name1()
	{
			name();
	System.out.println("Heyyyyyyyyy");
	}
	}

class B extends A
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.name1();
		
		System.out.println(a1);
		// System.out.println(b);
}
}

