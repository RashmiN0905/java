class P 
{
	public static void main(String[] args) 
	{
		
		int num=12345;
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
		System.out.println(num+ "is even");
	}
}
