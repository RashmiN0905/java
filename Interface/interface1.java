public interface Interface 
{
	int a=10;

	public static void demo()
	{
		System.out.println("Hello World!"+a);
	}

	void demo1();
}
class A implements Interface
{
void demo1()
{
			System.out.println(a);
}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
