 import java.util.Scanner;
class F
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
			if(m%3==0 && m%5==0)
			{
	System.out.println(m);
			}
			m++;
		}
	
	}
}
