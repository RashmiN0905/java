class  Demo
{
	public static void main(String[] args) 
	{
		//static int a=10;
		//System.out.println(v);
	}
	static
	{
		 int v=2;
	}
	static int r = 3;
}

class  Demo1
{
	static int a=10;

	public static void main(String[] args) 
	{
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(Demo1.a);
		System.out.println(Demo1.s);
		System.out.println(Demo.r);  
		//System.out.println(r);    (CTE) CANNOT FIND SYMBOL---------- WE CANNOT ACCESS THE STATIC VARIABLES OF ANOTHER CLASS DIRECTLY BY ITS NAME
	}
	static
	{
		 int v=2;
	}
	static int s = 3;
}


class  Demo2
{
	static int a=10;

	public static void main(String[] args) 
	{

	//static
	//{
	//	 int v=2;
	//}*/-------------- //CTE -- ILLEGAL START OF EXPRESSION  ----------we cannot write method inside another method 
	}
	
	//static
	//{
	//public static void m1()//CTE -- ILLEGAL START OF EXPRESSION  ----------we cannot write method inside any  another method or any other block
	//	{
	//	}
	//}
static int s = 3;
}


class  Demo3
{
	static int a=10;
	public static void Static()
	{
		System.out.println("STATIC");
	}

	public static void mainnee()
	{
		System.out.println("MAinnee");
	}

	public static void main(String[] args) 
	{
		
		  Static();
		  mainnee();
		  Demo3.Static();
		  Demo3.mainnee();

		  Demo3 d = new Demo3();
		  d.Static();
		  d.mainnee();
		//  System.out.println(Demo3.Static());// CTE-------- 'void' type not allowed herem 
		  System.out.println(Demo3.mainnee());// CTE-------- 'void' type not allowed here
		   // System.out.println(d.mainnee());// CTE-------- 'void' type not allowed here


	}
}

