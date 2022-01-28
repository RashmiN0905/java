import java.util.Scanner;
class C 
{
	public static int area(int l,int b)
	{
		int areaOfRectangle=l*b;

		return areaOfRectangle;
	}
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);

		System.out.println("Enter the length of the recatngle");

		int length= Sc.nextInt();

		System.out.println("Enter the breadth of the recatngle");

		int breadth= Sc.nextInt();
		
		int  area1= area(length,breadth);

		System.out.println("Area of Reactangle of length "+length+ " and " +breadth+ " is " +area1);
	}
}

