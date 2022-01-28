 interface CommandLineArgument
{
void mail();
}
 interface CommandLineArgument1
{
void mail();
}
class A implements CommandLineArgument,CommandLineArgument1
{
	public void mail()
	{
		System.out.println("fghj");
	}
	public static void main(String[]args)
	{
		A a = new A();
		a.mail();
	}
}