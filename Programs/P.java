class P 
{
	public static void main(String[] args) 
	{
		
		int num=1235489;
		int count=0;
		int ld;
		while(num>0)
		{
		ld=num%10;
		if(num%2==0){
		count++;
		}
		num=num/10;
		}
		System.out.println(count );
	}
}
