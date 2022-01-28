class EvenFact
{
	public static void main(String[] args) 
	{
		int num= 156;
		int fact=1;
		while(num>0)
		{
		int i= num%10;
		if (i%2==0)
		{
		for(int n=1; n<=i; n++)
			{
			fact = fact*n;
			}
		}
		System.out.println(fact);
		num=num/10;
		}
		
	}
}
