class Prime
{
	public static void main(String[] args) 
	{
		int num= 45;
		int count=2;

		for(int i=2; i<num ; i++)
		{
		if(num%i==0)
		{
			count++;
			if(count>2)
			{
				System.out.println(num+" is not prime number");
			}
		}
		else
		{
		  System.out.println(num+" is a prime number");  
		}


		}	
	}



class Prime1
{
	public static void main(String[] args) 
	{
		int num= 556;
		int count=2;

		for(int i=2; i<num ; i++)
		{
		if(num%i==0)
		{
				count++;
		}
		}
		if(count >2)
		  System.out.println("it is not prime nor");
		else
			System.out.println("it is prime nor");


	}
}


class Prime1
{
	public static void main(String[] args) 
	{
		//int num=100;
		
	
		for(int i=1; i<100; i++)
		{
			int sum=0;
			for(int j=1; j<i; j++)
			{
			if(i%j==0)
			{
				sum=sum+i;
			}
			}
		
			if(sum==i)
			{
			System.out.println(i+" is a Prime number");
			}
		}
	}
	}

