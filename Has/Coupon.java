class Coupon
{
	String Class;
	String Standby;
	int mealcode;
	String date_of_Redemption;
	Coupon()
	{
	}
	Coupon(String Class,String Standby,int mealcode,String date_of_Redemption)
	{
		this.Class=Class;
		this.Standby= Standby;
		this.mealcode=mealcode;
		this.date_of_Redemption= date_of_Redemption;	
	}
public void display()
	{
		System.out.println("Class is : "+Class +'\n'+"Standby is : "+Standby);
		System.out.println();
		System.out.println("mealcode is : "+mealcode);
		System.out.println("date_of_Redemption is : "+date_of_Redemption);
	}
}
class Ticket
{
	Coupon c1;
	int ticketcode;
	int number;
	Ticket()
	{
	}
	Ticket(int ticketcode,int number)
	{
		this.ticketcode=ticketcode;
		this.number=number;
	}	
	public void bookTicket(Coupon c1)
	{
		this.c1=c1;
		System.out.println("Your ticket is Booked succesfully ");
	}
	public void display()
	{
	System.out.println("ticketcode is : "+ticketcode);
	System.out.println("seat number is : "+number);
	}
}
class Customer
{	
	Ticket t= new Ticket(25, 68);
	String name;
	String date_of_birth;
Customer()
	{
	}
	Customer(String name,String date_of_birth)
	{
		this.name=name;
		this.date_of_birth=date_of_birth;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("date_of_birth: "+date_of_birth);
	}
}
class Driver
{
	public static void main(String[] args) 
	{
	Customer c= new Customer(" Rashmi N ", "09-05-1998");
	c.display();
	c.t.display();
	c.t.bookTicket(new Coupon(" Gold Class ", " 05-12-2021 ", 8795, " 02-12-2021"));
	c.t.c1.display();
	}
}
