class A
{
	public A demo()
	{
		System.out.println("Rash");
		return new A();//*********************************************************************************************************
	}
}

class B extends A
{
	public B demo()
	{
		System.out.println("Var");
		return "Rashmi";
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		B b = new B();
		
		System.out.println(b.demo());
	}
	
	
}
