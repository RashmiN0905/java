class Pen 
{
	String Brand;
	String colour;
	int price;

	public static void main(String[] args) 
	{
		Pen P1 = new Pen();
		Pen P2 = new Pen();
		Pen P3 = new Pen();

		P1.Brand = "Parker";
		P1.colour = "Blue";
		P1.price = 200;

		P2.Brand = "Reynolds";
		P2.colour = "Black";
		P2.price = 20;

		P3.Brand = "Montex";
		P3.colour = "Red";
		P3.price = 100;

		

	System.out.println("DETAILS OF THE PENS");
	System.out.println("");
	System.out.println("Pen Brand: "+P1.Brand);
	System.out.println("Pen colour: "+P1.colour);
	System.out.println("Pen price: "+P1.price);
	System.out.println("================== ");

	System.out.println("Pen Brand: "+P2.Brand);
	System.out.println("Pen colour: "+P2.colour);
	System.out.println("Pen price: "+P2.price);
	System.out.println("================== ");

	System.out.println("Pen Brand: "+P3.Brand);
	System.out.println("Pen colour: "+P3.colour);
	System.out.println("Pen price: "+P3.price);
	System.out.println("================== ");
	

	}
}
