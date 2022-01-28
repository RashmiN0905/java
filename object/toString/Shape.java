class Shape 
{

}

class Circle extends Shape
{
	int radius;

	Circle(int radius)
	{
		this.radius=radius;
	}
	public String toString()
	{
		return   " Radius : "+ radius;
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;

	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public String toString()
	{
		return   " length : "+ length+ " and  breadth ="+breadth;
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(91);
		Rectangle r = new Rectangle( 85, 95);
		
		System.out.println(c);
		System.out.println(r);
	}
}








class Shape1 
{
		public static void main(String[] args) 
	{
		Shape1 c = new Circle1(91);
		Shape1 r = new Rectangle1( 85, 95);
		
		System.out.println(c);
		System.out.println(r);
	}
}

class Circle1 extends Shape1
{
	int radius;

	Circle1(int radius)
	{
		this.radius=radius;
	}
	public String toString()
	{
		return   " Radius : "+ radius;
	}
}
class Rectangle1 extends Shape1
{
	int length;
	int breadth;

	Rectangle1(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public String toString()
	{
		return   " length : "+ length+ " and  breadth ="+breadth;
	}
}

