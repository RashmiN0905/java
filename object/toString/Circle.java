class Circle
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public String toString()
	{
		return "radius : "+radius;
	}

	public static void main(String[] args) 
	{
		Circle c = new Circle(5);
		System.out.println(c);
		System.out.println(c.toString());
	}
}


class Circle1
{
	int radius;

	Circle1(int radius)
	{
		this.radius=radius;
	}

	public static void main(String[] args) 
	{
		Circle1 c = new Circle1(5);
		System.out.println(c);
		//System.out.println(c.toString());
	}
}
