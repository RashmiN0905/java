import java.util.Scanner;
class B 
{
	public static char check(char ch)
	{
		if((ch>'a' && ch < 'z')|| (ch>'A' && ch < 'Z'))
		{
			System.out.println("it is a  alphabet");
		}
		else if(ch > '0' && ch < '9')
		{
			System.out.println("it is a number");
		}
		else
			System.out.println("it is a special character");

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
