class Palindrome
{
	public static void main(String[] args) 
	{
		int num=303;
		int n1=num;
		int sum=0;
		while(num>0)
		{
		int n = num%10;
		sum= sum*10+n;
		num=num/10;
		}
		if (sum==n1)
		{
		System.out.println("Is a Palindrome");
		}
		else
			System.out.println("Is not a Palindrome");
	}
}
