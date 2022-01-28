
// sum of digits of a num and if the sum is greater than 9, again take the sum of digits of that sum until the sum value become <9

class num1 
{
	public static void main(String[] args) 
	{
		int num=99999999;
		int sum=0;
		//int sum1=local(sum);
		
		while(num>0)
		{
			int n1= num%10;
			sum=sum+n1;
			num=num/10;
		}
		if(sum>9)
		{
			local(sum);
		System.out.println(local(sum));
		}
		else
		{
		System.out.println(sum);
		}
	}
	public static int local( int sum)
	{
		int nu=0;
		while(sum>0)
		{
			int n2= sum%10;
			nu = nu +n2;
			sum= sum/10;
		}
		return nu;
	}
}

class num2
{

public static void main(String[] args)
	{
		int sum=0;
		int num=7896;
	do
	{
		
		while(num>0)
		{
			int dig = num%10;
			sum = sum+dig;
			num=num/10;
		}
		num=sum;
		sum=0;
	}
	while (num>9);
System.out.println(num);
	}

}
