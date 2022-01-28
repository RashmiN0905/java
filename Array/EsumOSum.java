import java.util.Scanner;
class EsumOSum
{
	public static void main(String[] args) 
	{
		int Esum=0;
		int Osum=0;
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
			if (a[i]%2==0)
			{
				Esum=Esum+a[i];
			}
			else
			{
				Esum=Esum+a[i];
			}
			
		}
		System.out.println( "========================================");
		System.out.println(Esum+ " is the Even sum and " +Osum+ " is the odd sum of the integers in array");

	}
}