import java.util.Scanner;
abstract class Ola 
{
 String cust_name;
 long contact_num;

abstract public void bookRide();

}

class Auto extends Ola
{
String source="Rajajinagar";
	String destination="Basavangudi";
	int time=30;
	double distance=18;
	double ratePerKm= 15;
	double gst=1.1;

	public void bookRide()
	{
	System.out.println("------------------------------" );
	System.out.println("Source is "+source);
	System.out.println("Destination of the ride is "+destination);
	System.out.println("time of the ride "+time+ "min");
	System.out.println("Total distance of your is "+distance+ "km");
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
	System.out.println("------------------------------" );
	
	}
	Auto()
	{
	}
	Auto(String source,String destination,int time,double distance)
	{
		this.source=source;
		this.distance=distance;
		this.time=time;
		this.destination=destination;
	}
}
	class Mini extends Ola
{
String source="magadi";
	String destination="Basavangudi";
	int time=150;
	double distance=45;
	double ratePerKm= 17;
	double gst=1.1;

	public void bookRide()
	{
			System.out.println("------------------------------" );
	System.out.println("Source is "+source);
	System.out.println("Destination of the ride is "+destination);
	System.out.println("time of the ride "+time+ "min");
	System.out.println("Total distance of your is "+distance+ "km");
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
		System.out.println("------------------------------" );
	}
	Mini()
	{
	}
	Mini(String source,String destination,int time,double distance,	double ratePerKm)
	{
		this.source=source;
		this.distance=distance;
		this.time=time;
		this.destination=destination;
		this.ratePerKm=ratePerKm;
	}

}

class Prime extends Ola
{
	String source="Ramanagar";
	String destination="kanakpura";
	int time=40;
	double distance;
	double ratePerKm= 20;
	double gst=1.1;

	public void bookRide()
	{
			System.out.println("------------------------------" );
	System.out.println("Source is "+source);
	System.out.println("Destination of the ride is "+destination);
	System.out.println("time of the ride "+time+ "min");
	System.out.println("Total distance of your is "+distance+ "km");
	System.out.println("Cost of the ride is "+ratePerKm*gst*distance );
		System.out.println("------------------------------" );
	}
	Prime()
	{
	}
	Prime(String source,String destination,int time,double distance)
	{
		this.source=source;
		this.distance=distance;
		this.time=time;
		this.destination=destination;
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
