class Parent 
{
	int p = 5;
}


class Child extends Parent
{
	int c = 10;
}

class Driver
{
	
	public static void main(String[] args) 
	{
		Child c1 = new Child();
		System.out.println(c1.c);
		System.out.println(c1.p);

		Parent c2 = new Child();//UPCASTING
		//System.out.println(c2.c);
		System.out.println(c2.p);

		Child c3 = (Child)c2;// DOWNCASTING
		System.out.println(c3.c);
	}

}

