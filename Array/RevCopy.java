import java.util.Scanner;
class RevCopy
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		float[]a= new float[size];
		float[]b=new float[size];
		
		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array");
			a[i]=Sc.nextFloat();
		}

		for(int i=0; i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=b.length-1; i>=0;i--)
		{
			System.out.println(b[i]);
		}

	}
}

class RevCopy1
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		float[]a= new float[size];
		float[]b=new float[size];
		
		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array");
			a[i]=Sc.nextFloat();
		}
		
		int n=size-1;
		for(int i=0; i<a.length;i++)
		{
			b[n--]=a[i];
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(b[i]);
		}

	}
}