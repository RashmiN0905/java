import java.util.Scanner;
class Strong 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter the number");
		int num= Sc.nextInt();
		int n=num;
		int sum=0;

		while(num>0)
		{
		int num1= num%10;
		int fact=1;
		while(num1>0)
			{
			fact= fact*num1;
			num1--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(n==sum)
		{
		System.out.println(n+" is a Strong number");
		}
		/*else
			System.out.println(n+" is not a Strong number");*/
	}
}




class Strong1
{
	public static void Strongrange(int a, int b)
	{
		

		for(; a<=b; a++)
		{int sum=0;
			int i =a;
			while(i>0)
			{
			int num = i%10;
			int fact=1;
			while(num>0)
			{
			fact = fact*num;
			num--;
			}
			sum= sum+fact;
			i=i/10;
			}
		
		if(a==sum)
		{
		System.out.println(a+" is a Strong number");
		}
		/*else
			{
			System.out.println(j+" is not a Strong number");
			}*/

		}
	}

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int num1= Sc.nextInt();

		System.out.println("Enter the Last number");
		int num2= Sc.nextInt();

		Strongrange(num1,num2);
	}
}
		


