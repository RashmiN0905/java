import java.util.Scanner;
class Rev 
{
	public static void main(String[] args) 
	{
		String  s="RASHMI";
		for(int i=s.length()-1; i>=0; i--)
		{
		System.out.print(s.charAt(i));
		}
	}
}


class Rev1 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		String  s=Sc.nextLine();
		String s1=" ";

		for(int i=s.length()-1; i>=0; i--)
		{
				s1= s1+s.charAt(i);
		
		}
		
		System.out.print(s1);
	}
}

class Rev2
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		String  s="rama";
		String s1= new String("rashmi");

		StringBuffer name = new StringBuffer(s1);
		StringBuffer n = name.append("heidi");
		System.out.print(n);
		StringBuilder name1 = new StringBuilder(s1);
		StringBuilder m = name1.append("Nagaraj");
				System.out.print(m);

	}
}
