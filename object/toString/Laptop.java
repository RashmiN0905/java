class Laptop 
{
	int ram;
	int rom;
	int processor_speed;

	Laptop(int ram,int rom,int processor_speed)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor_speed=processor_speed;
	}
	public String toString()
	{
		return " 1.RAM of the computer is: "+ ram+"GB "+" 2. ROM of the computer is: " +rom +"TB "+"3.processor_speed of the computer is : "+processor_speed;
	}
	public boolean equals(Object o)
	{
		Laptop l1 = (Laptop)o;
		if(this.ram==l1.ram && this.rom==l1.rom && this.processor_speed==l1.processor_speed)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Laptop l1= new Laptop(6, 1, 45);
		Laptop l2= l1;
		Laptop l3= new Laptop(4, 2, 5);
		Laptop l4= new Laptop(4, 2, 5);
		System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l3));
		System.out.println(l3.equals(l4));
		System.out.println(l1==l2);
		System.out.println(l3==l4);
		System.out.println(l2==l3);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
	}
}
