import java.util.*;
class addMethod {

	public static void main(String[] args) {
		HashSet a1 = new HashSet();// adding the elements
		a1.add(10);
		a1.add("R");
		a1.add('R');
		a1.add(20);

		HashSet a2 = new HashSet();
		a2.add(10.0);
		a2.addAll(a1);
	System.out.println(a2);
Collections.sort(a2);
for(Object O: a2)
		{
	System.out.println(o);
	}
}
}



		
