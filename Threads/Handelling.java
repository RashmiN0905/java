class Handelling implements Runnable
{
	Implementing()
	{
	}
	public void run()
	{
		System.out.println(" Hello............");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
		System.out.println("Exception is handelled in Handelling class");
		}
		System.out.println("Handelling class thread is Executing");
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
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
		System.out.println("Exception is handelled in child class");
		}
		System.out.println("Child thread is Executing");
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new Implementing( "The Child"));
		Child t2 = new Child();
		t1.start();
		t2.start();
		
		/*System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());

		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());*/
	}
}