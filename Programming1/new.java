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