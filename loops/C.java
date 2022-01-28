 import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m = Sc.nextInt();
		System.out.println("Enter the value of n");
		int n = Sc.nextInt();
		int count=0;
		
		while(m<=n)
		{
			count++;
			m++;
		}
	System.out.println("total Numbers present in between " +count);
	}
}