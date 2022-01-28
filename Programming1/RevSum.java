class RevNum 
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		while(num>0)
		{
		int n = num%10;
		sum= sum*10+n;
		num=num/10;
		}
		System.out.println(sum);
	}
}
