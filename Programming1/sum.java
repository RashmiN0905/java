class  sum
{
	public static void main(String[] args) 
	{
		int num= 123456;

		int Esum=0;
		int Osum=0;

		while(num>0)
		{
		int n = num%10;
		if (n%2==0)
		{
			Esum= Esum+n;
		}
	
		else
			{
			Osum=Osum+n;
		
			}
		num=num/10;
		}
		 System.out.println(Osum);
			System.out.println(Esum);
	}
}




































