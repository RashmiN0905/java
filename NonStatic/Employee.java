import java.util.Scanner;
class Employee 
{
	int eid;
	String name;
	double salary;


	public void toSetAttributes()
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter Emp Eid");
		eid= Sc.nextInt();

		System.out.println("Enter Emp name");
		name= Sc.next();

		System.out.println("Enter Emp salary");
		salary= Sc.nextDouble();
	}

		public void toPrintAttributes()
	{
		System.out.println("Enter Emp Eid: "+eid);
		System.out.println("Enter Emp name: "+name);
		System.out.println("Enter Emp salary: "+salary);

	}
	public static void main(String[] args) 
	{
		Employee E1= new Employee();
		Employee E2= new Employee();
		Employee E3= new Employee();
		System.out.println("==========");
		E1.toSetAttributes();
		E1.toPrintAttributes();
		System.out.println("==========");
		E2.toSetAttributes();
		E2.toPrintAttributes();
		System.out.println("==========");
		E3.toSetAttributes();
		E3.toPrintAttributes();
		
	}
}
