class Perfect
{
	public static void main(String[] args) 
	{
		int num=45;
		int sum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==num)
			{
			System.out.println(num+" is a Perfect number");
			}
			else
				System.out.println(num+" is not a Perfect number");
	}
}


class RangPerf
{
	public static void main(String[] args) 
	{

		for(int i=1; i<100; i++)
		{
			int sum=0;
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
			System.out.println(i+" is a Perfect number");
			}
			}
		
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