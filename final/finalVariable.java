class A
{
	final int a=10;
	//a=15;// we cannot change the value of the final variable or we cannot re-initialise the value

	final int b;// we cannot make the final variables as default, we must initialise it

	{
		b=10;// we can initialize the non static variable with help of non static block;
	}
	final int c;
	A()
	{
	c=15;// we can initialize the non static variable with help of constructor also;
	}
			
}

class B extends A
{
	public static void main(String[] args) 
	{
		B b1= new B();
		System.out.println(b1.a);
	}
}


///STATIC
class C
{
	final static int a=10;
	//a=15;// we cannot change the value of the final variable or we cannot re-initialise the value

	final int b;// we cannot make the final variables as default, we must initialise it
	static
	{
		b=10;// we can initialize the static variable with help of static block;
	}
	final int c;
	//C()
	{
	c=15;// we cannot initialize the  static variable with help of constructor ;
	}//
			
}