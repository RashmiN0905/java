class Smallest 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=5;
		int num3=4;

		if(num1<num2 && num1<num3)
		{
		System.out.println(num1+" : is the smallest of 3 numbers ");
		}
		else if(num2<num3)
		{
		System.out.println(num2+" : is the smallest of 3 numbers ");
		}
		else
		{
			System.out.println(num3+" : is the smallest of 3 numbers ");
		}

	}
}
