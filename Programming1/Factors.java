class Factors 
{
	public static void main(String[] args) 
	{
		int num=15;

		for(int i=1; i<=15; i++)
		{
			if(num%i==0)
			
			System.out.println(i);
		}
		
	}
}


class EvenFact 
{
	public static void main(String[] args) 
	{
		int num=50;

		for(int i=1; i<=15; i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
				System.out.println(i);
			}
			
			
		}
		
	}
}



class Fact 
{
	public static void main(String[] args) 
	{
		int num=5056;
		int Ecount=0;
		int Ocount=0;

		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
				{
				Ecount++;
				}
				else
				{
				Ocount++;
				}
			}
		}
			System.out.println(Ecount);
			System.out.println(Ocount);
			
		
		
	}
}


class Fact1
{
	public static void main(String[] args) 
	{
		int num=6;
		int sum=0;
		

		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			sum= sum+i;
			}
		}
			System.out.println(sum);		
	}
}



