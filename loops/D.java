 import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = Sc.nextInt();
		System.out.println("Enter the value of n");
		int n = Sc.nextInt();
		int sum=0;
		
		while(m<=n)
		{
			sum= sum+m;

			m++;
		}
	System.out.println("total Numbers present in between " +sum);
	}
}
