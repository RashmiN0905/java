import java.util.*;
class Activity {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println(" ENTER THE SENTENCE");
		String st= Sc.nextLine();
		
		HashSet a1 = new HashSet();
		int count=0;
		for(int i=0; i< st.length(); i++)
		{
		a1.add((st.charAt(i)));
		count++;
		}
		
		System.out.println(a1 +"and the count is "+count);


	}
}