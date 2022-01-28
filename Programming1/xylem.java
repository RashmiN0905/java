class  Xylem
{
	public static void main(String[] args) 
	{
		int num,num1,x,y;
		num=131216;
		 num1=num;
		 x=0;
		 y=0;
		while(num>0)
		{

			int dig = num%10;
			if(num==num1||num<9)
			{
				x=x+dig;
			}
			else
			{
			y=y+dig;
			}
			num=num/10;
		}
		if(x==y)
		{
		System.out.println(num1+" is a Xylem number");
		}
		else
		{
		System.out.println(num1+" is a Phloem number");
		}
	}
}
