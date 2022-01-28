class SingleLevel 
{
	int a=10;
	
		
}


class mine extends SingleLevel
{
	static int g = 10;
	int b;

	public static void main (String[]args)
	{
		mine m = new mine();
		System.out.println(m.b);
	}
}