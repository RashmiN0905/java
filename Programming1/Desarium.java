class Desarium  
{
	public static void main(String[] args) 
	{

		int num=125;
		int num1=num;
		int count=count(num);
		int sum=0;

		while(num>0)
		{
		int n = num%10;
		sum= sum+pow(n, count);

		num=num/10;
		count--;
		}
	
	if (sum == num1)
	{
		System.out.println(num1+ " is a Desarium num");
	}
	else 
	{
	System.out.println(num1+ " is not a  Desarium  num");
	}
	}
	public static int count(int num)
		{
		int count=0;
		while(num>0)
		{
		num=num/10;
		count++;
		
		}
		return count;
		}

		public static int pow(int n, int count)
		{
			int pow=1;
			for(int i=1; i<=count;i++)
			{
			pow = pow *n;
			}
		return pow;
		}
	}
