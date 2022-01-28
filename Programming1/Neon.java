class Neon
{
	public static void main(String[] args) 
	{
		int num =9;
		int sum=0;
		int square = num*num;
		while(square>0)
		{
			int dig = square%10;
			sum= sum+dig;
			square = square/10;
		}
		if (num==sum)
		{
			System.out.println(num+" is a Neon number");
		}
		else
		{
			System.out.println(num+" is not a neon number");
		}
		
	}
}
