import java.util.Scanner;
class EvenfirstPrint
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
		int n=0;
		for(int i=0; i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				b[n++]=a[i];
			}
		}
		for(int i=0; i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
			b[n++]=a[i];
			}
		}		
	
		for(int i=0; i<b.length;i++)
		{
		System.out.println(b[i]);
		}


	}
}


class OddfirstPrint
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
		int n=0;
		for(int i=0; i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				b[n++]=a[i];
			}
		}
		for(int i=0; i<a.length;i++)
		{
			if((i+1)%2==0)
			{
			b[n++]=a[i];
			}
		}		
	System.out.println("---------------------------------------");
		for(int i=0; i<b.length;i++)
		{
		System.out.println(b[i]);
		}


	}
}



