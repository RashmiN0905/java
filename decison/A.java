import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = Sc.nextInt();

		if(num%5==0)
		{
		System.out.println("LUCKY");
		}
	}
}

