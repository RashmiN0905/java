import java.util.Scanner;
class count
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		int[]a= new int[size];
		
		for(int i=0; i<a.length;i++)
		{
				System.out.println("Enter the value for the Array");
			a[i]=Sc.nextInt();
		}
	
		for(int i=0; i<a.length;i++)
		{
			count=count+a[i];
		}
		System.out.println( "========================================");
		System.out.println(count+ " is the total sum of the integers in array");

	}
}