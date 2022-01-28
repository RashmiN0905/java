class SimCard 
{
	private long number;
	private  String Service_provider;
	private double local_call_rate;

	public long getNumber()
	{
		return number;
	}

	public String getService_provider()
	{
		return Service_provider;
	}

	public void setService_provider(String Service_provider)
	{
		this.Service_provider=Service_provider;
	}
	
	public double getlocal_call_rate()
	{
		return local_call_rate;
	}

	public void setlocal_call_rate(double local_call_rate)
	{
		this.local_call_rate = local_call_rate;
	}

SimCard ()
	{
	}

	SimCard (long number)
	{
		this.number=number;
	}

	SimCard (long number, String Service_provider)
	{
		this(number);
		this. Service_provider=Service_provider;
	}

	SimCard (long number, String Service_provider,double local_call_rate)
	{
		this(number, Service_provider);
		this. local_call_rate= local_call_rate;
	}



	public void printSimDetails()
	{
		System.out.println("Sim card number : "+number);
		System.out.println("Sim card Service_provider : "+Service_provider);
		System.out.println("Sim card local_call_rate : "+local_call_rate);


	}

	public static void main (String[]args)
	{
		SimCard S1 = new SimCard(12345878995l, "Airtel", 14.25);
		S1.setlocal_call_rate(S1.getlocal_call_rate()*1.1);
		S1.printSimDetails();
	}


}
