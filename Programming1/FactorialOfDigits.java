class  FactorialOfDigits
{
	public static void main(String[] args) 
	{
		int num=784;
		while(num>0)
		{	
			long fact=1;
			int n = num%10;
			while(n>0)
			{
			
			fact= fact*n;
			
			n--;
			}
			System.out.println(+fact);
		
			num=num/10;
		
		}
		
	}
}