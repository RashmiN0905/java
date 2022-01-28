 import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = Sc.nextInt();
		System.out.println("Enter the value of n");
		int n = Sc.nextInt();
		
		
		while(m<=n)
		{
			if(m%2==0)
		System.out.println(m+ " is even ");
			else
		System.out.println(m+ " is odd ");

		m++;
		}
	}
}