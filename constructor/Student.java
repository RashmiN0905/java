import java.util.Scanner;
class Student 
{
	int Student_id;
	String name;
	int age;
	double percentage;


	Student ()
	{
	}

	Student (int Student_id)
	{
		this.Student_id=Student_id;
	}
	
	Student (int Student_id,String name)
	{
		this(Student_id);
		this.name= name;
	}

	Student (int Student_id,String name,int age)
	{
		this(Student_id, name);
		this.age=age;

	}

	Student (int Student_id,String name,int age,double percentage)
	{
		this(Student_id, name, age);
		this.percentage=percentage;

	}

	public void display_Attribute()
	{
		System.out.println("ID of the Student is : "+Student_id);
		System.out.println("Name of the Student is : "+name);
		System.out.println("Age of the Student is : "+age);
		System.out.println("Percentage of the Student is : "+percentage);
	}
	public void edit_name()
	{
		Scanner Sc= new Scanner(System.in);

		System.out.println("Enter the name: ");

		String name1 = Sc.next();

		this.name=name1;
		System.out.println(name);
	
	}



}
