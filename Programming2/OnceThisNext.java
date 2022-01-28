import java.util.Scanner;
class OncethisNext
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array A");
		System.out.println("==============================");
		int size1 = Sc.nextInt();
		System.out.println("Enter the size of the Array B");
		System.out.println("==============================");
		int size2 = Sc.nextInt();
		int size3 = size1+size2;
		int[]a= new int[size1];
		int[]b= new int[size2];
		int[]c= new int[size3];

		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array A");
			a[i]=Sc.nextInt();
		}
		for(int i=0; i<b.length;i++)
		{
		System.out.println("Enter the value for the Array B");
			b[i]=Sc.nextInt();
		}
		int n=0;
		for(int i=0; i<c.length;i++)
		{
			if(i<a.length)
			{
			c[n++]=a[i];
			}
			if(i<b.length)
			{
			c[n++]=b[i];
			}
		}
		System.out.println("==============================");
		for(int i=0; i<c.length;i++)
		{
		System.out.println(c[i]);
		}
	}
}


class OncethisNext1
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array A");
		System.out.println("==============================");
		int size1 = Sc.nextInt();
		System.out.println("Enter the size of the Array B");
		System.out.println("==============================");
		int size2 = Sc.nextInt();
		int size3 = size1+size2;
		int[]a= new int[size1];
		int[]b= new int[size2];
		int[]c= new int[size3];

		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array A");
			a[i]=Sc.nextInt();
		}
		for(int i=0; i<b.length;i++)
		{
		System.out.println("Enter the value for the Array B");
			b[i]=Sc.nextInt();
		}
		int n=0;
		int m=0;
		int j=0;
		while(j<c.length)
		{
			if(n<a.length)
			{
			c[j++]=a[n++];
			}
			if(m<b.length)
			{
			c[j++]=b[m++];
			}
		}
		System.out.println("==============================");
		for(int i=0; i<c.length;i++)
		{
		System.out.println(c[i]);
		}
	}
}