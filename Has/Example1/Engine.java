class Engine 
{
	private int engine_no;
	private int cc;

	public int getEngine_no()
	{
		return engine_no;
	}

	public int getCc()
	{
		return cc;
	}

	Engine(int engine_no,int cc)
	{
		this.engine_no= engine_no;
		this.cc= cc;
	}

	public void getEngineDetails()
	{
		System.out.println("The Engine Number is :"+engine_no);
		System.out.println("Engine CC is :"+cc);
	}
	
}
