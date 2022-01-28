class Fibonacci 
{
	public static void main(String[] args) 
	{
		int n=5;
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		int count=2;
		int sum=0;
		while(count<5)
		{
			sum = n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			count++;
		}
	}
}
