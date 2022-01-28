import java.util.Scanner;
class Homepage
{
	String pickup = "Bangalore";
	String destination = "Mysore" ;

}

class Auto extends Homepage
{
	double cost_per_km=35.60;
}

class Prime extends Homepage
{
	double cost_per_km= 85.12;
}

class Mini extends Homepage
{
	double cost_per_km=65.25;
}



class Ola 
{
	Homepage h;
	String name = "Rashmi";
	int Contact_num= 987421;

	public  void BookRide(Homepage h)
	{
		this.h=h;
		System.out.println("Your  Ride is Booked");
	}
	
	public  void CancelRide()
	{	h=null;
		
		System.out.println("Ride is Cancelled, Book your Ride");
	}

	public  void CurrentRide()
	{
		if(h instanceof Auto)
		{
		Auto a = (Auto)h;
		System.out.println("Cost of your ride is " +a.cost_per_km);
		}
		else if(h instanceof Prime)
		{
		Prime a = (Prime)h;
		System.out.println("Cost of your ride is " +a.cost_per_km);
		}
		else if(h instanceof Mini)
		{
		Mini a = (Mini)h;
		System.out.println("Cost of your ride is " +a.cost_per_km);
		}
		else
		{
			System.out.println("Enter valid option");
		}

	}

}

class Driver
{
public static void main(String[] args) 
	{
	Scanner Sc = new Scanner(System.in);
		Ola o = new Ola();
		boolean flag = true;
		do
		{
		System.out.println("==============================");
		System.out.println("Welcome to Ola ");
		System.out.println("*****************************");
		System.out.println("1.Book ride   a.Book Auto   b. Book Prime    c. Book mini");
		System.out.println("2.Current ride");
		System.out.println("3.Cancel ride");
		System.out.println("4. Exit");
		System.out.println("*****************************");
		System.out.println("Enter your option");

		int opt = Sc.nextInt();

		switch(opt)
		{
		case 1:
		{
		System.out.println("Enter your option A for Auto");
		System.out.println("Enter your option B for Prime");
		System.out.println("Enter your option C for Mini");
		char opt1 = Sc.next().charAt(0);
		switch(opt1)
		{
		case 'A':
		{
		o.BookRide(new Auto());
		break;
		}
		case 'B':
		{
		o.BookRide(new Prime());
		break;
		}
		case 'C':
		{
		o.BookRide(new Mini());
		break;
		}
		default:
		{
		System.out.println("Enter valid option ");
		}
		}
		break;
		}
		case 2: 
		{
		o.CurrentRide();
		break;
		}
		case 3: 
		{
		o.CancelRide();
		break;
		}
		case 4:
		{
		flag=false;
		break;
		}
		default: 
		{
			System.out.println("Enter valid option ");
		}
		}
		}
		while(flag);
		}
		}


