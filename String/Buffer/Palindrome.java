import java.util.Scanner;
class Rev
{
	public static void main(String[] args) 
	{
		StringBuffer b = new StringBuffer("MALAYALAM");
		StringBuffer pal = new StringBuffer();
		
		for(int i=b.length()-1; i>=0; i--)
		{
			pal.append(b.charAt(i));
		}
		System.out.println(pal);
		String pal1 = new String(pal);
		String b1 = new String(b);

		if(b1.equals(pal1))
		{
System.out.println(b1+"  is palindrome");
		}
		else
		{
			System.out.println(b1+ " is not palindrome");
		}
	}
}



class Rev1
{

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println( " Enter the String ");
		String s = Sc.nextLine();
		StringBuffer b = new StringBuffer(s);
		StringBuffer pal = new StringBuffer();
		
		for(int i=b.length()-1; i>=0; i--)
		{
			pal.append(b.charAt(i));
		}
		System.out.println(pal);
		String pal1 = new String(pal);
		String b1 = new String(b);

		if(b1.equals(pal1))
		{
System.out.println(b1+"  is palindrome");
		}
		else
		{
			System.out.println(b1+ " is not palindrome");
		}
	}
}

