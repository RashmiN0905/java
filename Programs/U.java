import java.util.Scanner;
class  U
{

	
	public static int num(int a,int b)
	{
		int sum= a+b;
		return sum;
	}
	
	public static int num(int a,int b,int c)
	{
		
		int sum= a+b+c;
		return sum;
	}
	
	public static int num(int a,int b,int c, int d)
	{
		int sum= a+b+c+d;
		return sum;
	}

	public static void main(String[] args) 
	{
		
		
		
		System.out.println("----------Welcome----------");
		
		System.out.println("press 1 to add two num");
		System.out.println("press 2 to add three num");
		System.out.println("press 3 to add four num");
		Scanner Sc= new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		int d=Sc.nextInt();
		//int a=1;
		//int b=2;
		//int c=3;
		//int d=4;
	System.out.println(num(a,b));
	System.out.println(num(a,b,c));
	System.out.println(num(a,b,c,d));

		System.out.println("-------Thank you---------");
	
	}
}
