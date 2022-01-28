import java.util.*;
class Activity1 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		/*System.out.println(" Number" );
		
		HashSet a1 = new HashSet();

		a1.add(Sc.nextInt());
		a1.add(Sc.nextInt());
		a1.add(Sc.nextInt());
		a1.add(Sc.nextInt());
		a1.add(Sc.nextInt());*/
		
		System.out.println("Enter the size " );
		int size = Sc.nextInt();
		HashSet a1 = new HashSet();
		for(int i=0; i<=size; i++)
		{
			a1.add(Sc.nextInt());
		}

		System.out.println(a1);
		System.out.println("Sorted order is ");		
	    TreeSet a2 =new TreeSet(a1);			
		System.out.println(a2);


	}
}