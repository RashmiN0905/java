import java.util.Scanner;
class EvenPos
{
	public static void main(String[] args) 
	{
		int Esum=0;
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
			if ((i+1)%2==0)
			{
				Esum=Esum+a[i];
			}

		}
		System.out.println( "========================================");
		System.out.println(Esum+ " is the sum of even position sum of the integers in array");

	}
}