class Parent 
{
	static int a;
	int b;

	public static void demo()
	{
	}

	public void temp()
	{
	}
}

class Child extends Parent
{
	int c;
	static int d;
	public static void main(String[] args) 
	{

	Child c1 = new Child();
	Parent p1 = new Parent();

	if(c1 instanceof Child)
	{
	// c = c1;
	System.out.println(c1 instanceof Child);
	}

	if(p1 instanceof Parent)
	{
	//Parent P = p1;
	System.out.println(p1 instanceof Parent);
	}

	if(c1 instanceof Parent)
	{
//P2 = c1;
	System.out.println(c1 instanceof Parent);
	}
    if(P1 instanceof Child)
	{
	
	System.out.println(P1 instanceof Child);
	}


	
	}
}
