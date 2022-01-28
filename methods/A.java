import java.util.Scanner;
class  A
{
	public static int num(int a, int b)
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);

		System.out.println("Enter first value");
		int m = Sc.nextInt();

		System.out.println("Enter second value");
		int n= Sc.nextInt();

		int sum1=num(m,n);
		
		System.out.println("sum of " +m+ " and " +n+ " is "+ sum1);
	}
}
