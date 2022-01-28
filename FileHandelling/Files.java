import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class  Files
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		String s1 = Sc.next();	
		FileOutputStream h1 =null;
		try{
		h1= new FileOutputStream("E:\\FileHandelling\\name.txt");
		}
		catch(FileNotFoundException e)
		{
		}
		
		for(int i =0; i<s1.length(); i++)
		{
			try
		{
			h1.write(s1.charAt(i));
		}
		catch (IOException f)
		{

		}
	
		}		
	}
}
