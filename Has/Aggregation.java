class Sim
{
	private int simNo;
	String serviceProvider;

	public int getSimNo()
	{
		return simNo;
	}

    public void getSimDetails()
	{
		System.out.println("Sim number : "+simNo);
		System.out.println("Sim Service provider : "+serviceProvider);
	}

	Sim(){}

	Sim(int simNo, String serviceProvider)
	{
		this.simNo = simNo;
		this.serviceProvider = serviceProvider;
	}
}

class Mobile
{
	Sim s;
	String model;
	int price;

	public void getMobileDetails()
	{
			System.out.println("Sim Model : "+model);
			System.out.println("Sim price : "+price);
	}

	public void insertSim(Sim s)
	{
		 this.s = s;
		System.out.println("Sim is inserted ");
	}
	public void removeSim(Sim s)
	{
		 this.s=null;
		System.out.println("Sim is removed");
	}

	Mobile(){}

	Mobile(String model, int price)
	{
		this.model = model;
		this.price = price;
	}+
}

	class Driver
	{
	public static void main(String[] args) 
	{
		Mobile m = new Mobile("A10 S", 15000);
		m.getMobileDetails();
		m.insertSim(new Sim(123, "jio"));
		m.s.getSimDetails();
	}

}