class Fruit 
{

	String fruit="Mango";
}

class Vegetable extends Fruit
{
	String vegetable="Tomato";
}

class Driver 
{

	public static void main(String[] args) 
	{
		Fruit f = new Fruit();
		 Vegetable v = new  Vegetable();
		Fruit f1 = new Vegetable();
		//Vegetable v2 = (Vegetable)new Fruit();
		Vegetable v1 = (Vegetable)f1;
		System.out.println("Hello World!");

	}
}
