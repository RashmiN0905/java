class N 
{
	public static void main(String[] args) 
	{
		int num= 12345;
		int ld;
		int sum=0;

		while(num>0)
		{
		ld=num%10;
		sum=sum+ld;
		num=num/10;
		}
		System.out.println(sum);

}
	}