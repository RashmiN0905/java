//COMPOSITION

class Processor 
{
	double speed;
	int generation;

	Processor()
	{
	}

	Processor(double speed, int generation)
	{	
		this.speed=speed;
		this.generation=generation;
	}

	public void displayAttributes()
	{
		System.out.println("Speed of the Laptop :"+speed + "GHz");
		System.out.println("Generation of the Laptop :"+generation +" th");

	}
}

class Laptop
{
	//Processor p = new Processor(2.6, 10); 

Laptop(Processor p)
	{
	this.p=p;
	}
	String brand;
	int mrp;

	Laptop()
	{
	}

	Laptop(String brand, int mrp)
	{
		this. brand= brand;
		this.mrp=mrp;
	}
	
	public void displayAttributes()
	{
		System.out.println("Brand of the Laptop :"+brand);
		System.out.println("MRP of the Laptop :"+mrp);

	}

}


class Service
{
	public static void main(String[]args)
	{
		Laptop l= new Laptop("H P pavillion ", 70000);
		l.displayAttributes();
		l.p.displayAttributes();
	}
}