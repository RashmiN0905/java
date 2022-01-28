class Pen 
{
	double price;
	Pen(double price)
	{
		this.price=price;
	}
	@Override
		public int hashcode()
	{
		int hc = (int)price;
		return price;
	}
	public static void main(String[] args) 
	{
		Pen p = new Pen(9.25);
		System.out.println(p);
	}
}
