 import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the value of m");
		int num = Sc.nextInt();
	
		int rev=0;
		
		while(num>0)
		{
			int num1= num%10;

			rev= rev*10+num1;
			num=num/10;

		}
	System.out.println("reverse of the given number is  " +rev);
	}
}