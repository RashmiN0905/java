import java.util.Scanner;
abstract class Ola 
{
 String cust_name;
 long contact_num;

abstract public void bookRide();

}

class Auto extends Ola
{
	double distance=18;
	double ratePerKm= 15;
	double gst=1.1;

	public void bookRide()
	{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the source location");
	String source = Sc.next();
	System.out.println("Enter the Destination location");
	String destination = Sc.next();
	System.out.println("Enter the departure time");
	String time = Sc.next();
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
	System.out.println("------------------------------" );
	
	}
	Auto()
	{
	}
	Auto(double distance,	double ratePerKm)
	{
		this.distance=distance;
		this.ratePerKm=ratePerKm;
	}
}
	class Mini extends Ola
{
	double distance=18;
	double ratePerKm= 15;
	double gst=1.1;
	public void bookRide()
	{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the source location");
	String source = Sc.next();
	System.out.println("Enter the Destination location");
	String destination = Sc.next();
	System.out.println("Enter the departure time");
	String time = Sc.next();
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
	System.out.println("------------------------------" );
	}
	Mini()
	{
	}
	Mini(double distance,	double ratePerKm)
	{
		this.distance=distance;
		this.ratePerKm=ratePerKm;
	}

}

class Prime extends Ola
{
	double distance=26;
	double ratePerKm= 20;
	double gst=1.1;
	public void bookRide()
	{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the source location");
	String source = Sc.next();
	System.out.println("Enter the Destination location");
	String destination = Sc.next();
	System.out.println("Enter the departure time");
	String time = Sc.next();
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
	System.out.println("------------------------------" );
	}
	Prime()
	{
	}
	Prime(double distance,	double ratePerKm)
	{
		this.distance=distance;
		this.ratePerKm=ratePerKm;
		
	}

}

class Driver
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		Scanner Sc= new Scanner(System.in);
		
		do
		{
		System.out.println("Welcome to Ola");
		System.out.println("***************");
		System.out.println("1.Book Auto");
		System.out.println("2.Book Mini");
		System.out.println("3.Book Prime");
		System.out.println("4.Exit");
		System.out.println("*************");
		System.out.println("Enter your option");
		int opt = Sc.nextInt();

		switch(opt)
		{
			case 1:
				{
				Ola a= new Auto();
				a.cust_name = "RASHMI";
				a.contact_num=9731994218l;
				a.bookRide();
				}
				break;
	
			case 2:
				{
				Ola a= new Mini();
				a.cust_name = "Varsha";
				a.contact_num=6362629669l;
				a.bookRide();
				}
				break;
			case 3:
				{
				Ola a= new Prime();
				a.cust_name = "RASHI";
				a.contact_num=9942189731l;
				a.bookRide();
				}
				break;

			case 4:
			{
				flag=false;
				break;
			}
			default: 
			{
					System.out.println("Enter valid option");
			}
	
		}

		}
		while (true);

	}
}
