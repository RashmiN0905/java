class A 
{
	int a;
	int b = 10;

	public  void display() 
	{
		System.out.println("Hello ");
	}
	public static void main(String[]args)
	{
	System.out.println("================");
	}




}


class B extends A
{
	int c;
	int d=20;

	public static void main(String[]args)
	{
		B b1= new B();
		b1.display();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
	}

}
