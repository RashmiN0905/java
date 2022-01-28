import java.util.*;
class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		System.out.println("==============================");
		int size = Sc.nextInt();
		int[]a= new int[size];
		for(int i=0; i<a.length;i++)
		{
		System.out.println("Enter the value for the Array");
			a[i]=Sc.nextInt();
		}
		
		int low=0;
		int high=a.length-1;
		int mid=0;
		Arrays.sort(a);
		System.out.println("==============================");
		System.out.println("Enter the key Element");
		int key =Sc.nextInt();
		boolean flag=false;

		while(high>=low)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				flag=true;
				break;
			}
			else if(key>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid+1;
			}
		}
		if(flag==true)
		{
		System.out.println("==============================");
		System.out.println("Key element "+key+ " is found");
		}
		else
		{
		System.out.println("==============================");
		System.out.println("Key element "+key+ " is not found");
		}
	}
}
