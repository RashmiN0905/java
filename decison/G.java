 import java.util.Scanner;
class G
{
	public static void choice1(int a)
	{
		System.out.println("WELCOME TO NAMMA HOTEL");
		System.out.println("1.Idli sambar");
		System.out.println("2.Masala dosa");
		System.out.println("3.chow chow bath");
		System.out.println("4.pulav");
		System.out.println("5.curd rice");
		System.out.println("Enter the choice ");
		
		Scanner Sc= new Scanner(System.in);
		int choice = Sc.nextInt();


		if(choice >=1 && choice <=5)
		{
		switch(choice)
		{
		case 1:
		{
			System.out.println(" Idli sambar IS ON THE WAY");
		break;
		}
		
		case 2:
		{
			System.out.println(" Masala dosa IS ON THE WAY");
		break;
		}
		
		case 3:
		{
		System.out.println("chow chow bath  IS ON THE WAY");
		}
		
		case 4:
		{
			System.out.println("pulav  IS ON THE WAY");
		break;
		}

		case 5:
		{
			System.out.println("curd rice  IS ON THE WAY");
		break;
		}

		default:
			System.out.println("Enter valid option");
		}

		}
		else 
		System.out.println("Enter valid number");
		
	}
}
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the first num");
		int num1 = Sc.nextInt();
         
		 choice1(num1);
		

		}
	
} 
