class Parent 
{
	int num = 40;
	String  name;	
	{
		System.out.println("Non-Static parent");
	}
}


class Child extends Parent
{
	int a=30;

	{
		System.out.println("Non-Static child");
		System.out.println(super.num);
	}

}

class Driver
{
	public static void main(String[]args)
	{
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.num);
		System.out.println(c1.name);

	}
}