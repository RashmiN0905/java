import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class  readMethod
{
	public static void main(String[] args) throws Exception
	{
		Scanner Sc = new Scanner(System.in);
		String s1 = Sc.next();	
		FileOutputStream h1 = new FileOutputStream("E:\\FileHandelling\\name.txt");
		
		int n= h1.read();
		while((n)!= -1)
		{
			System.out.print((char)n);
			n=s1.read();
		}
		n.close();
	}
}

