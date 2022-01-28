class EvenSum 
{
	public static void main(String[] args) 
	{
		int num=456;
		int sum=0;
		while(num>0)
		{
			int num1= num%10;
			if(num1 % 2==0)
			{
				sum=sum+num1;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
