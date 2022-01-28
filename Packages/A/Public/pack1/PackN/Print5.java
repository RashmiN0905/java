import java.util.Scanner;
class Print5
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		int[]a= new int[size];
		System.out.println("Enter the size of the Array");
		int size = Sc.nextint();
		
		for(int i=0; i<a.length();i++)
		{
			a[i]=Sc.nextInt();
		}
		for(int i=0; i<a.length();i++)
		{
			System.out.println(a[i]);
		}

	}
}
