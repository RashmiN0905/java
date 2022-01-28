class Car 
{
	String name;
	int wheels;
	int price;

	Car()
	{

	}

	Car(String name)
	{
		this.name= name;
		System.out.println("================ ");
		System.out.println("Name of the car is : "+name);
	}
	
	Car(String name,int wheels )
	{
		this.name= name;
		this.wheels= wheels;
		System.out.println("================ ");
		System.out.println("Name of the car is : "+name);
		System.out.println("Number of wheels of the car is : "+wheels);

	}

	Car(String name,int wheels, int price )
	{
		this.name= name;
		this.wheels= wheels;
		this.price= price;
		System.out.println("================ ");
		System.out.println("Name of the car is : "+name);
		System.out.println("Number of wheels of the car is : "+wheels);
		System.out.println("Price of the car is : "+price);
	

	}

	
}
