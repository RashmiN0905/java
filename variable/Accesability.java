class Parent
{
	public static void Demo()
	{
		System.out.println("Parent method ");
	}

}

class Child1 extends Parent
{
	 static void Demo1()
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

		Parent P1 = new Child1();		
	}
}