import java.util.*;
class SortingHeterogeneous implements Comparable
{
		String name;
		double salary;

        SortingHeterogeneous(String name, double salary)
		{
			this.name=name;
			this.salary=salary;
		}

	public int compareTo(Object o)
	{
	 SortingHeterogeneous temp=( SortingHeterogeneous)o;
	 if(this.salary==temp.salary)
		{
		return 0;
		}
	 else if (this.salary>temp.salary)
		{
	return +1;
		}
	 else
		{
		return -1;		
	}
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(salary);

	}

	
}


class C1
{
	public static void main(String[]args)
	{
		ArrayList l = new ArrayList();
		l.add(new SortingHeterogeneous("mala", 5000));
		l.add(new SortingHeterogeneous("sheela", 3000));
		l.add(new SortingHeterogeneous("bala", 15000));

		Collections.sort(l);
		System.out.println(l);

		for(Object o : l)
		{
			((SortingHeterogeneous)o).display();
		}
	}
}
