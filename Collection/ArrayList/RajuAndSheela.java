import java.util.*;
class RajuAndSheela
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		ArrayList raju= new ArrayList();
		raju.add("Mathematics");
		raju.add("Geography");
		raju.add("English");
	System.out.println(" list of Raju's books is "+raju);
	
		ArrayList sheela= new ArrayList();
		sheela.add("Mathematics");
		sheela.add("Geography");
		sheela.add("Hindi");
	System.out.println(" list of sheela's books is "+sheela);


			sheela.removeAll(raju);

			System.out.println(sheela);
		
	}
}



class RajuAndSheela1
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		ArrayList raju= new ArrayList();
		raju.add("Mathematics");
		raju.add("Geography");
		raju.add("English");
	System.out.println(" list of Raju's books is "+raju);
	
		ArrayList sheela= new ArrayList();
		sheela.add("Mathematics");
		sheela.add("Geography");
		sheela.add("Hindi");
	System.out.println(" list of sheela's books is "+sheela);


			sheela.retainAll(raju);

			System.out.println(sheela);
		
	}
}