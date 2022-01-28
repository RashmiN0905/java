class A
{

	int a;
	int b;

	public void display()
	{
		System.out.println("Hello ");
	}

}


class B extends A
{

int c;
int d;

	public static void main(String[] args) 
	{

		B b1 = new B();
		b1.a=10;
		b1.b=20;
		b1.c=30;
		b1.d=40;
	
		b1.display();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
	}
}
