class EvenFact
{
	public static void main(String[] args) 
	{
		int num= 546;
		int fact=1;
		int sum=0;
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
			sum= sum+fact;
		    num=num/10;
	
		}
		System.out.println(fact);
		
	}
}
