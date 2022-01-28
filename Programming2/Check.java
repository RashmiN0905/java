import java.util.Scanner;
class Check
{
	public static void main(String[] args) 
	{
		do
		{
		Scanner Sc = new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the size of the Array");
		int size = Sc.nextInt();
		int[]a= new int[size];
		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array");
			a[i]=Sc.nextInt();
		}
		System.out.println("Enter the value to be searched");
		int b=Sc.nextInt();
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==b)
			{
			System.out.println("=======================");
			System.out.println("yes "+b+" is present");
			flag=true;
			break;
			}
		}
		if(flag==false)
		{
			System.out.println("No "+b+" is not present");
		}
		}
		while(true);
	}
}