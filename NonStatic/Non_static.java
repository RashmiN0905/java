class Non_static 
{
	int a;
	int b=10;
	static
	{
		int d=20;
	}

	public static void Demo()
	{
		int c=30;
		//System.out.println(a);
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		//System.out.println(a);
		Non_static n = new Non_static();

		System.out.println(n.a);
		System.out.println(n.b);
		//System.out.println(n.c);
		//System.out.println(n.d);
		//System.out.println(n.Demo());
		n.Demo();
	}
}


class Method
{
	int a;
	static int b=10;

	public void demo()
	{
		System.out.println("Demo");

	}
	public static void temp()
	{
		System.out.println("Temp");

	}

	public static void main(String[] args) 
	{
		Method n= new Method();
		//System.out.println(a);---------//non-static variable cannot be referenced from a static context
		System.out.println(n.a);//0
		System.out.println(b);//10
		System.out.println(n.b);//10
		n.demo();//Demo
		//demo();---------//non-static method demo() cannot be referenced from a static context
		temp();//Temp
		n.temp();//Temp

	}
}


class Method1
{
	int a;
	static int b=10;

	public void demo()
	{
		System.out.println("Demo");

	}
	public static void temp()
	{
		System.out.println("Temp");

	}
}

class Driver
{
	static
	{

	}

	public static void main(String[] args) 
	{
		Method1 n= new Method1();
		//System.out.println(a);---------//non-static variable cannot be referenced from a static context
		System.out.println(n.a);//0
		//System.out.println(b);//we cannot access another class members directly by its name
		System.out.println(n.b);//10
		n.demo();//Demo
		//demo();---------//non-static method demo() cannot be referenced from a static context
		//temp();//Temp----//we cannot access another class members directly by its name
		n.temp();//Temp

	}
}
