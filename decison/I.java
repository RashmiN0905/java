import java.util.Scanner;
class I
{
	public static void choice(int a)
	{
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturdayday");
		System.out.println("7.Sunday");
		System.out.println("------------------");
		System.out.println("Enter the choice ");
		
		Scanner Sc= new Scanner(System.in);
		int choice1 = Sc.nextInt();


		if(choice1 >=1 ||choice1 <=7)
		{
		switch(choice1)
		{
		case 1:
		case 4:
		{
			System.out.println("Study Kannada");
		break;
		}
		
		case 2:
		case 5:
		{
			System.out.println("Study English");
		break;
		}
		case 3:
		case 6:
		{
			System.out.println("Study Hindi");
		break;
		
		}
		

		default:
			{
			System.out.println("Holiday");

		}
		}
		}
		else 
		System.out.println("Enter valid number");
		
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = Sc.nextInt();
        choice(num1);
		

		}
	
}
