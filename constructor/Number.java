class Number
{
	private int digits;
	private String name;

Number(int digits, String name)
	{
	this.digits = digits;
	this.name= name;
	}

	public void toPrint()
	{
		System.out.println("Number of digits in number : "+digits);
		System.out.println("name of the Number "+name); 
	}

}