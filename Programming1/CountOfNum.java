class  CountOfNum
{
	public static void main(String[] args) 
	{
		int num=45674;
		
		while(num>0)
		{
			int n = num%10;
			System.out.println(n);
			num=num/10;
		}
		
	}
}
