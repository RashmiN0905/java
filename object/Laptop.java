class Laptop
{
	String Brand;
	String colour;
	int price;

	public static void main(String[] args) 
	{
		Laptop L1 = new Laptop();
		Laptop L2 = new Laptop();
		Laptop L3 = new Laptop();

		L1.Brand = "HP Pavillion";
		L1.colour = "white";
		L1.price = 78000;

		L2.Brand = "HP";
		L2.colour = "Black";
		L2.price = 62500;

		L3.Brand = "MAC";
		L3.colour = "Silver";
		L3.price = 105000;

		

	System.out.println("DETAILS OF THE LAPTOPS");
	System.out.println("");
	System.out.println("Laptop Brand: "+L1.Brand);
	System.out.println("Laptop colour: "+L1.colour);
	System.out.println("Laptop price: "+L1.price);
	System.out.println("================== ");

	System.out.println("Laptop Brand: "+L2.Brand);
	System.out.println("Laptop colour: "+L2.colour);
	System.out.println("Laptop price: "+L2.price);
	System.out.println("================== ");

	System.out.println("Laptop Brand: "+L3.Brand);
	System.out.println("Laptop colour: "+L3.colour);
	System.out.println("Laptop price: "+L3.price);
	System.out.println("================== ");
	

	}
}
