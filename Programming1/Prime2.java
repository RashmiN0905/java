class Prime2
{
	public static void main(String[] args) 
	{

		
		for(int i=10; i<=20;i++)
		{	boolean flag = false;
		for(int j=2; j<i ; j++)
		{
		if(i%j==0)
		{
			flag = true;
			
		}
		}
		if(flag==false)
		  System.out.println(i+ "  is a prime number" );
		}
		
	}
}
