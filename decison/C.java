import java.util.Scanner;
class C
{
	public static void num(int a, int b, int c)
	{
		

		if(a>b && a>c)
		{
			System.out.println(a+" is greatest of all 3 number");
		}
		else if(b > c )
		{
			System.out.println(b+" is greatest of all 3 number");
		}
		
		else
			System.out.println(c+ " is greatest of all 3 number");
		
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the num1");
		int num1 = Sc.nextInt();

		System.out.println("Enter the num2");
		int num2 = Sc.nextInt();

		System.out.println("Enter the num3");
		int num3 = Sc.nextInt();

		
		 num(num1, num2, num3);

		
		}
	
}