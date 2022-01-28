// Real time example using a program on Interface 

package Problems_08_01_2022;

interface Employee
{
	int a=10;
	
	void display();
}

class Developer implements Employee
{
	public void display()
	{
		System.out.println("Developer will write code for the software");
	}
}

class TestEngineer implements Employee
{
	public void display()
	{
		System.out.println("Test Engineer will write test cases for the software");
	}
}

class QualityAnalyst implements Employee
{
	public void display()
	{
		System.out.println("Quality Analyst will ensure the performance of the employees");
	}
}

class ProjectManager implements Employee
{
	public void display()
	{
		System.out.println("Project Manager will oversee the project");
	}
}

public class InterfaceProgram
{
	public s…
[1:38 pm, 08/01/2022] +91 76764 76286: // Real time example usinmg a Java program on HashMap

package Problems_08_01_2022;

import java.util.HashMap;

public class HashMapProgram 
{
	public static void main(String[]args)
	{
		HashMap<Integer,String> employees = new HashMap<>();
		employees.put(1, "Prasanna");
		employees.put(2, "Santhosh");
		employees.put(3, "Shreyas");
		employees.put(4, "Nandish");
		
		System.out.println(employees);
		
		HashMap moreEmployees = new HashMap();
		moreEmployees.put(5, "Prasanna");
		moreEmployees.put(4, "Vinod");
		moreEmployees.put(6, "Munnegowda");
		
		System.out.println(moreEmployees);
		
		employees.putAll(moreEmployees);
		
		System.out.println(employees);
		System.out.println(employees.get(5));	
		System.out.println(employees.remove(5));
		System.out.println(employees);
		System.out.println(employees.isEmpty());
	}
}
[1:38 pm, 08/01/2022] +91 76764 76286: // Use generics and write a program on all the class under List (Collection)



import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable
{
	int studentId;
	String name;
	double percentage;
	
	Student(){}
	
	Student(int studentId, String name, double percentage)
	{
		this.studentId = studentId;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int compareTo(Object o)
	{
		Student s = (Student) o;
		return this.studentId-s.studentId;
	}
	
	public void display()
	{
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+name);
		System.out.println("Student Percentage: "+percentage);
		System.out.println("--------------------------------------------");
…
[1:39 pm, 08/01/2022] +91 76764 76286: // Using Scanner class, write a program to reverse the String entered by user. (The string must be a sentence)

package Problems_08_01_2022;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = s.nextLine();
		
		System.out.println();
		System.out.println("The reversed sentence by character is:\n"+reversedByChar(sentence));
		System.out.println();
		System.out.println("The reversed sentence by words is:\n"+reversedByWords(sentence));
	}
	
	public static String reversedByChar(String sentence)
	{
		StringBuffer reverse = new StringBuffer(sentence);
		reverse.reverse();
		String reversedSentence = new String(re…
[1:39 pm, 08/01/2022] +91 76764 76286: // Write a program to show diamond problem in inheritance using super() statement

package Problems_08_01_2022;

class Parent1
{
	static int a = 10;
	int b = 20;
}

class Parent2
{
	static int a = 100;
	int b = 200;
}


public class DiamodProblem extends Parent
{
	public static void main(String[]args) 
	{
		DiamodProblem = new DiamodProblem();
		System.out.println(d.a);
		System.out.println(d.b);
	}
}




import java.util.Scanner;

public class CustomExceptionUsingMethodRecursion 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to countdown from: ");
		int n = s.nextInt();
		try
		{
			count(n);
		}
		catch(CannotBeNegativeException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Countdown completed!");
	}
	
	public static void count(int n)throws CannotBeNegativeException
	{
		if(n<0)
		{
			throw new CannotBeNegativeException();
		}
		System.out.println(n--);
		count(n);
	}
}

class CannotBeNegativeException extends Exception
{
	public String getMessage()
	{
		return "The countdown can't be negative";
	}
}



import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of fibonacci numbers required: ");
		int n = s.nextInt();
		
		if(n == 1)
		{
			System.out.print(0);
		}
		else if(n == 2)
		{
			System.out.print("0 1");
		}
		else
		{
			System.out.print("0 1");
			fibonacciGenerator(0, 1, n-2);
		}
	}
	
	public static void fibonacciGenerator(int n1, int n2, int n)
	{
		if(n == 0)
		{
			return;
		}
		System.out.print(" "+(n1+n2));
		int n3 = n1+n2;
		n1 = n2;
		n2 = n3;
		fibonacciGenerator(n1, n2, --n);
	}
}