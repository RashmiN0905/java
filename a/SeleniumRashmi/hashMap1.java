import java.util.*;
public class hashMap1 {
	
		public static void main(String[]args)
		{
			HashMap<Integer,String> employees = new HashMap<>();
			employees.put(1, "FGBNN");
			employees.put(2, "Anu");
			employees.put(3, "param");
			employees.put(4, "JAM");
			
			System.out.println(employees);
			
			HashMap moreEmployees = new HashMap();
			moreEmployees.put(5, "Shyam");
			moreEmployees.put(4, "bama");
			moreEmployees.put(6, "RAM");
			
			System.out.println(moreEmployees);
			
			employees.putAll(moreEmployees);
			
			System.out.println(employees);
			System.out.println(employees.get(5));	
			System.out.println(employees.remove(5));
			System.out.println(employees);
			System.out.println(employees.isEmpty());
		}
	}