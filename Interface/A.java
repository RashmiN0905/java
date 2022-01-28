class A 
{
C c= (C)new A();	
}

interface C
{
}
class B extends A implements C
{
	public static void main(String[] args) 
	{
		A b = new B();

		
		System.out.println("Hello World!");
	}

}