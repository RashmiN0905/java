class Parent
{
	public static void Demo()
	{
		System.out.println("Parent method ");
	}

}

class Child1 extends Parent
{
	public static void Demo()
	{
		System.out.println("Child-1 method ");
	}
}

class Child2 extends Child1
{
	public static void Demo()
	{
		System.out.println("Child-2 method ");
	}
}


class Driver 
{
	public static void main(String[] args) 
	{

		Parent P1 = new Parent();
		P1.Demo();//PArent 
		System.out.println("=============");

		Child1 b1 = new Child1();
		b1.Demo();//CHILD-1 
	System.out.println("=============");

		 Parent b2 = new Child1();
		 b2.Demo();//PArent
		System.out.println("=============");

		Parent b3 = new Child2();
		 b3.Demo();//Parent
		System.out.println("=============");

		Child1 b4 = new Child2();
		 b4.Demo();//CHILD-1 
		System.out.println("=============");

		
		Child2 b5 = new Child2();
		 b5.Demo();//CHILD-2
		System.out.println("=============");



		
	}
}