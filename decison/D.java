import java.util.Scanner;
class D
{
	public static void year(int a)
	{
		

		if(a%100!=0 && a%4==0||a%400==0)
		{
			System.out.println(a+" is leap year");
		}
		
		else
			System.out.println(a+" is not leap year");
		
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the year");
		int num1 = Sc.nextInt();
		year(num1);

		}
	
}
