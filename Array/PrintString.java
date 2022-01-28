import java.util.Scanner;
class PrintString
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		String[]a= new String[size];
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter the value for the Array");
		
			a[i]=Sc.next();
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}