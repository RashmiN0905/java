import java.util.Scanner;
import java.io.*;
class A  extends Thread
{
	A()
	{
	}
	public void run()
	{
	System.out.println("Overriding-1-----------");
	A.write1();
	System.out.println("Writing Thread is completed");
	}

	public synchronized static void write1()
	{	
		Scanner Sc = new Scanner(System.in);
		FileOutputStream h1=null;
		try
		{
		 h1 = new FileOutputStream("E:\\Threads\\File.txt");
		}
		catch ( FileNotFoundException f)
		{
			System.out.println(" FNF Exception is Handelled");
		}

		String s1=Sc.nextLine();
		try
		{
		for (int i=0;i<s1.length() ;i++ )
		{
			h1.write(s1.charAt(i));
			Thread.sleep(1000);
		}	
		}
		catch (Exception i)
		{
	System.out.println("Exception is Handelled");
		}
		
	}

	public synchronized static void read1()
	{
		 int n=0;
		FileInputStream h2 =null;
		try
		{
	 h2 = new FileInputStream("E:\\Threads\\File.txt");
		}
		catch (Exception e1)
		{
		System.out.println("Exception is Handelled");
		}
		
		try
		{
		n= h2.read();	
		}
		catch (Exception e2)
		{
          System.out.println("Exception is Handelled");  
		}
		
		while(n!=-1)
		{
		System.out.println((char)n);
		try
		{
		n= h2.read();	
		}
		catch (Exception e3)
		{
          System.out.println("Exception is Handelled");
		}
				try
				{
				Thread.sleep(1000);	
				}
				catch (Exception e2)
				{
					System.out.println("Exception is Handelled");
				}		
		}
	}
	}
class B  extends A
{
	
	B()
	{
	}
	public void run()
	{
	System.out.println("Overriding-2------------");
	B.read1();
	System.out.println("Reading Thread is completed");
	}


}

class Driver
{
public static void main(String[] args) throws Exception
	{
	Thread t = new Thread(new A());
	Thread t1 = new Thread(new B());
	t1.start();
	t.start();
	}
}
