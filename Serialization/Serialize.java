import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.Serializable;
class Employee implements Serializable
{
	int eid;
	String name;
	double salary;

	Employee()
	{
	}

	Employee(int eid, String name, double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}

	/*public String toString()
	{
		return "Employee id: "+eid+ " Employee name : "+name+ " Employee salary : "+salary; 
	}*/
	public static void main(String[] args) throws Exception
	{
		Employee e = new Employee(101, "Rashmi", 15000.00);
		Scanner Sc = new Scanner(System.in);
		FileOutputStream f1 = new FileOutputStream("E:\\Serialization\\ File1.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		String S1 = Sc.next();
		o1.writeObject(e);
		o1.close();



		/*FileInputStream f2 = new FileInputStream("E:\\Serialization\\ File1.txt");
		ObjectInputStream o2 = new ObjectInputStream(f2);
		System.out.println(o2.readObject());
		o2.close();*/



	}
}
