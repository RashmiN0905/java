import java.util.Scanner;
class Print5
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		int[]a= new int[size];
		int[]b= new unt[size];
		for(int i=0; i<a.length;i++)
		{
				System.out.println("Enter the value for the Array");
			a[i]=Sc.nextInt();
		}
		int n=size;
		for(int i=0; i<a.length;i++)
		{
		}
			
			for(int j=0; j<b.length; j++)
			{
			if((a[i]+b[j])==7)
				{
			System.out.println(a[i]+ " "+b[j]);
				}
			}
		}

	}
}