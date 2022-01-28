



class A
{
	int a=10;
	int b=80;
}

class B extends A
{
	int a=45;
	int b=85;
}

class Driver 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.a);//CHILD CLASS MEMBERS
		System.out.println(b1.b);//CHILD CLASS MEMBERS
		System.out.println("=============");

		A b2 = new A();
		System.out.println(b2.a);//PARENT CLASS MEMBERS
		System.out.println(b2.b);//PARENT CLASS MEMBERS
		System.out.println("=============");

		A b3 = new B();
		System.out.println(b3.a);//PARENT CLASS MEMBERS
		System.out.println(b3.b);//PARENT CLASS MEMBERS
		System.out.println("=============");

		//B b4 = new A();
		//System.out.println(b4.a);//CHILD CLASS MEMBERS
		//System.out.println(b4.b);//CHILD CLASS MEMBERS
		//System.out.println("=============");  //  COMPILE TIME ERROR  

		//B A b5 = (A)new B();
		//System.out.println(b5.a);//PARENT CLASS MEMBERS
		//System.out.println(b5.b);//PARENT CLASS MEMBERS
		//System.out.println("============="); COMPILE TIME ERROR      *//

		B b6 =(B)b3;
		System.out.println(b6.a);//CHILD CLASS MEMBERS
		System.out.println(b6.b);//CHILD CLASS MEMBERS
		System.out.println("=============");
	}
}
