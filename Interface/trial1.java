interface trial1 
{
static int a=10;
}
interface trial2
{
int a=20;
}
class A implements trial1,trial2
{
	public static void main(String[]args)
	{
		System.out.println(trial2.a);
	}
}
