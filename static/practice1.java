class Practice1 
{
	static int a;
	static int b;
	
	static
	{
		System.out.println("SIB=1 STARTS");
		System.out.println(a);
		System.out.println(Practice1.a);
		Practice1.a=10;
		b=20;
		System.out.println("SIB=1 ENDS");
	}
static
	{
		System.out.println("SIB=2 STARTS");
		System.out.println(a);
		System.out.println(b);
		
		b=30;
		System.out.println("SIB=2 ENDS");
	}

	public static int test()
	{
		System.out.println("test() starts");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("test() ends");
		return 50;
	}

	public static void main(String[] args) 
	{
		System.out.println("main() starts");
		int a=test();
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("test() ends");
		
	}
}
