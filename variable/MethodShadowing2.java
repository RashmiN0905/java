class Parent
{
	public static void Demo()
	{
		System.out.println("Parent method ");
	}

}

class Child1 extends Parent
{
	public static void Demo1()
	{
		System.out.println("Child-1 method ");
	}
}

class Child2 extends Child1
{
	public static void Demo2()
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
		//P1.Demo1();//CTE
		//P1.Demo2();//CTE
		System.out.println("=============");

		Child1 b1 = new Child1();
		b1.Demo();//Parent 
		b1.Demo1();//Child-1
		//b1.Demo2();//CTE
		System.out.println("=============");

		 Parent b2 = new Child1();
		 b2.Demo();//PArent
		// b2.Demo1();//CTE
		// b2.Demo2();//CTE
		System.out.println("=============");

		Parent b3 = new Child2();
		 b3.Demo();//Parent
		// b3.Demo1();//CTE
		 //b3.Demo2();//CTE
		System.out.println("=============");

		Child1 b4 = new Child2();
		 b4.Demo(); //PARENT 
		  b4.Demo1();//CHILD-1
		 // b4.Demo2();//CTE
		System.out.println("=============");

		
		Child2 b5 = new Child2();
		 b5.Demo();//Parent
		  b5.Demo1();//CHILD-1
		   b5.Demo2();//CHILD-2
		System.out.println("=============");





		
	}
}