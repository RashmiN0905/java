class  Threads
{
	public static void main(String[] args) throws Exception
	{
		String name = Thread.currentThread().getName();
		System.out.println("Name of the Thread is :" +name);
		System.out.println("id of the Thread is :" +Thread.currentThread().getId());
		System.out.println("Priority of the Thread is :" +Thread.currentThread().getPriority());
		System.out.println("Group of the Thread is :" +Thread.currentThread().getThreadGroup());

		for(int i=0; i<30; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}
}
