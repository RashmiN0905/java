import java.util.Scanner;
class F
{
	public static void addition(int a, int b)
	{
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter the choice ");
		
		Scanner Sc= new Scanner(System.in);
		int choice = Sc.nextInt();


		if(choice >=1 && choice <=4)
		{
		switch(choice)
		{
		case 1:
		{
			System.out.println("Addition of the numbers "+a+ " and " +b+ " is " +(a+b));
		break;
		}
		
		case 2:
		{
			System.out.println("Subtraction of the numbers "+a+ " and " +b+ " is " +(a-b));
		break;
		}
		
		case 3:
		{
		System.out.println("Multiplication of the numbers "+a+ " and " +b+ " is " +(a*b));
		break;
		}
		
		case 4:
		{
			System.out.println("Division of the numbers "+a+ " and " +b+ " is " +(a/b));
		break;
		}

		default:
			System.out.println("Enter valid option");
		}

		}
		else 
		System.out.println("Enter valid number");
		
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the first num");
		int num1 = Sc.nextInt();

		System.out.println("Enter the Second num");
		int num2 = Sc.nextInt();
        addition(num1, num2);
		

		}
	
}
