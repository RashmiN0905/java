
class Employee1
{
	int eid;
	String name;
	double salary;


	public void toSetAttributes(int eid,String name,double salary)
	{
	this.eid =	 eid;
	this.name = name;
	this.salary =salary;

		
	
	}

		public void toPrintAttributes()
	{
		System.out.println("Enter Emp Eid: "+eid);
		System.out.println("Enter Emp name: "+name);
		System.out.println("Enter Emp salary: "+salary);

	}
	public static void main(String[] args) 
	{
		Employee1 E1= new Employee1();
		Employee1 E2= new Employee1();
		Employee1 E3= new Employee1();
		System.out.println("==========");
		E1.toSetAttributes(1, " RASHMI" , 15512);
		E1.toPrintAttributes();
	System.out.println("==========");
		E2.toSetAttributes(2, "VARSHA",45445);
		E2.toPrintAttributes();
	System.out.println("==========");
		E3.toSetAttributes(3, "HARSH", 84565);
		E3.toPrintAttributes();
		
	}
}
