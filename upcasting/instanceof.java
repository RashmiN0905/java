class A 
{	
}

class B extends A
{

}

class C extends B
{
}

class D extends C
{
}

class Driver
{
	public static void main(String[]args)
	{
		A a =new A();
		B b = new B();
		C c =new C();
		D d=new D();
		System.out.println(a instanceof A);
		System.out.println( b instanceof A);
		System.out.println(c instanceof A);
		System.out.println(d instanceof A);
		System.out.println( "========================");
		System.out.println(a instanceof B);
		System.out.println( b instanceof B);
		System.out.println(c instanceof B);
		System.out.println(d instanceof B);
		System.out.println( "========================");
		System.out.println( a instanceof C);
		System.out.println( b instanceof C);
		System.out.println(c instanceof C);
		System.out.println(d instanceof C);
		System.out.println( "========================");
		System.out.println( a instanceof D);
		System.out.println( b instanceof D);
		System.out.println(c instanceof D);
		System.out.println(d instanceof D);



	}
}


