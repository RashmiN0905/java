class AppV1 
{
public void feature1()
	{
System.out.println("Oldest");
	}
}

class AppV2 extends AppV1 
{

	public void feature2()
	{
System.out.println("new feature added");
	}
 @Override
public void feature1(int a)
	{
System.out.println("Uploaded feature");
	}
}

class Driver
{

	public static void main(String[] args) 
	{
		AppV1 app = new AppV2();
		app.feature1();
	}
}
