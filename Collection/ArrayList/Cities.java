import java.util.*;
class Cities
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		ArrayList l= new ArrayList();
		l.add("Bangalore");
		l.add("Mysore");
		l.add("Hassan");
		l.add("Chikmagalore");

		Object s =Sc.next().trim();
		
		System.out.println(l);

		if(l.contains(s))
		{
			//l.remove(s);
			l.remove(l.indexOf(s));
			System.out.println(l);
		}
		else
		{		
		System.out.println(l);
		}
	}
}
