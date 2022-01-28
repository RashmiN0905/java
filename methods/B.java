import java.util.Scanner;
class B 
{
	public static double area(int r)
	{
		double areaOfCircle=3.14*r*r;

		return areaOfCircle;
	}
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);

		System.out.println("Enter the radius of the circle");

		int rad= Sc.nextInt();
		
		double area1= area(rad);
		System.out.println("radius of circle of radius "+rad+ " is " +area1);
	}
}
