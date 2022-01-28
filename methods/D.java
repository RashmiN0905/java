import java.util.Scanner;
class D 
{
	public static String perc( double a, double b,String a1, String b1)
	{
	String largest= a>b? a1:b1;
	
	return largest;
	}
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter name of the student 1");
		String name1 =Sc.next();

		System.out.println("Enter perc of the student 1");
		double perc1 = Sc.nextDouble();

		System.out.println("Enter name of the student 2");
		String name2 = Sc.next();

		System.out.println("Enter perc of the student 2");
		double perc2 = Sc.nextDouble();

		String sum = perc(perc1, perc2, name1, name2);
		System.out.println(" the student got highest percentage is " +sum);
	}
}
