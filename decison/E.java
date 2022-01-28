import java.util.Scanner;
class E
{
	public static char check(char ch)
	{
		if(ch>'a' && ch < 'z')
		{
			System.out.println("it is a lowercase alphabet");
		}
		else if(ch>'A' && ch < 'Z')
		{
			System.out.println("it is a uppercase alphabet");
		}
		
		return ch;
			
	}

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch = Sc.next().charAt(0);

		
		check(ch);
		}
}
	