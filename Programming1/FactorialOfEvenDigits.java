class Sam
{
	public static void main(String[] args) 
	{
		int num= 126;
		int fact=1;
		while(num>0)
		{
		int i= num%10;
		if (i%2==0)
		{
		for(int n=1; n<=i; n++)
			{
			fact = fact*n;
			System.out.println(fact);
			}
			//System.out.println(fact);
		}
		//System.out.println(fact);
		num=num/10;
		}
		
	}
}
