class  Q
{
	public static void main(String[] args) 
	{
		int num1 =256;
		int ld1;
		int num2 = 172;
		int ld2;
		int sum1=0;
		int sum2=0;
		while(num1>0 && num2>0)
		{
		ld1=num1%10;
		ld2=num2%10;
		sum1=ld1+ld2;
		sum2=sum2+sum1;
		num1=num1/10;
		num2=num2/10;
		
		}
		System.out.println(sum2);
		//sum2=sum2+sum1;
		
	}
}
