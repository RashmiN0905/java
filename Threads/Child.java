class Child extends Thread
{
	Child(String s)
	{
		super(s);
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Child c = new Child("The Child");
		System.out.println(Thread.currentThread().getName());
		System.out.println(c.getName());
		System.out.println(c.getId());
		System.out.println(c.getPriority());
	}
}//---------------------- User defined Thread is created not in Runnable mode---------------------------


class Child1 extends Thread
{
	Child1(String s)
	{
		super(s);
	}
	public void run()
	{
	System.out.println("heyyyyyyyyyyyyyyyyyy");
	}
}

class Driver1
{
	public static void main(String[] args) 
	{
		Child1 c = new Child1("The Child");
		System.out.println(Thread.currentThread().getName());
		c.start();
		System.out.println(c.getName());
		System.out.println(c.getId());
		System.out.println(c.getPriority());
	}
}//---------------------- User defined Thread is created and it is running by overiding the run metod in thread---------------------------
