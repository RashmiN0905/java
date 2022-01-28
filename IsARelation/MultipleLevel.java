class A 
{
	int a;
	int b;
	public static void main(String[]args)
	{
		A aa = new A();
	System.out.println(aa.a);
	System.out.println(aa.b);

	}
}

class B extends A
{
	int c;
	int d;
	public static void main(String[]args)
	{
		B bb =new B();
	System.out.println(bb.a);
	System.out.println(bb.b);
	System.out.println(bb.c);
	System.out.println(bb.d);
	}
}

class C extends B
{
	int e;
	int f;

	public static void main(String[]args)
	{
		C cc = new C();
	System.out.println(cc.a);
	System.out.println(cc.b);
	System.out.println(cc.c);
	System.out.println(cc.d);
	System.out.println(cc.e);
	System.out.println(cc.f);
	}

}
