class Car 
{
	 
	Engine e = new Engine(859, 180);
	String model;
	int price;
	String colour;

	Car(String model,int price,String colour)
	{
		this.model=model;
		this. price= price;
		this.colour=colour;
		
	}

	public void getCarDetails()
	{
		System.out.println("The Car Model name is :"+model);
		System.out.println("Price of car is :"+price);
		System.out.println("Colour of car is :"+colour);
	}
	
}
