class Student 
{
	String name;
	int SID;

	public static void main(String[] args) 
	{
		Student S1 = new Student();
		Student S2 = new Student();

		S1.name="RASHMI N";
		S1.SID= 1;

		S2.name="VARSHA N";
		S2.SID= 2;

	System.out.println("DETAILS OF THE STUDENTS");
	System.out.println("");
	System.out.println("Student name: "+S1.name);
	System.out.println("Student ID: "+S1.SID);
	System.out.println("================== ");

	System.out.println("Student name: "+S2.name);
	System.out.println("Student ID: "+S2.SID);
	System.out.println("================== ");

	}
}
