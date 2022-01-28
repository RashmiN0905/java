class Implementing implements Runnable
{
	Implementing(String s)
	{
	}
	public void run()
	{
		System.out.println(" Hiiiii............");
	}
}
class Child extends Thread
{
	Child()
	{
	}

	public void run()
	{
		System.out.println(" Hello............");
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new Implementing( "The Child"));
		Child t2 = new Child();
		
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());

		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());
	}
}
