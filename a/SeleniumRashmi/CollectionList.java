import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Integer> a=new ArrayList();
		  a.add(10);
	      a.add(20);
	      a.add(30);
	      a.add(10);
	      System.out.println(a);
	      HashSet <Integer>h =new HashSet();
	      h.addAll(a);
	      System.out.println(h);
	      TreeSet <Integer>t=new TreeSet();
	      t.addAll(h);
	      System.out.println(t);
	      
	      HashMap <Integer,Integer>m=new HashMap();
			m.put(1,20);
			m.put(3,50);
			m.put(2,30);
			m.put(5,100);
			m.put(4,null);    //allows both null as key n values
			m.put(6,null);
			System.out.println(m);
			
			  TreeMap <Integer,Integer>m1=new TreeMap();
			  m1.putAll(m);              // wont allow null as key but allows null as value it throws nullpointer exception
			  System.out.println(m1);
			   
				Hashtable <Integer,Integer>m2=new Hashtable();
				m2.putAll(m);                // wont allow null values it throws nullpointer exception
				System.out.println(m2);
			
			
			

	}
    }
