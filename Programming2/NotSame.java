import java.util.Scanner;
class NotSame
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array A");
		System.out.println("==============================");
		int size1 = Sc.nextInt();
		int[]a= new int[size1];


		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array A");
			a[i]=Sc.nextInt();
		}
			int sum=0;

		for(int i=0; i<a.length;i++)
		{
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				flag=1;
				a[j]=0;
			}
		}
		if(flag==0)
			{
			sum=sum+a[i];
			}
		}
		System.out.println("==============================");

		System.out.println(sum);
	
	}
}



class NotSame
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array A");
		System.out.println("==============================");
		int size1 = Sc.nextInt();
		int[]a= new int[size1];


		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array A");
			a[i]=Sc.nextInt();
		}
			int sum=0;

		for(int i=0; i<a.length;i++)
		{
		int flag=0;
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				flag=1;
				a[j]=0;
			}
		}
		if(flag==0)
			{
			sum=sum+a[i];
			}
		}
		System.out.println("==============================");

		System.out.println(sum);
	
	}
}