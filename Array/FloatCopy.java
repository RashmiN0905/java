import java.util.Scanner;
class FloatCopy
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
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}
}