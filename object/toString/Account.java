class SavingsAccount 
{
	long account_no;
	String name;
	double balance  ;

	SavingsAccount ()
	{
	}

	SavingsAccount (long account_no,String name,double balance)
	{
		this. account_no= account_no;
		this. name= name;
		this.balance= balance;
	}

	public String toString()
	{
		return "account_no : "+account_no + " name: "+name + " balance : "+balance;
	}
	public static void main(String[] args) 
	{
		SavingsAccount a = new SavingsAccount(1332500103315601l, "Rashmi N", 45000 );
		System.out.println(a);

	}
}


/*
class SavingsAccount1 
{
	long account_no;
	String name;
	double balance  ;

	SavingsAccount1 ()
	{
	}

	SavingsAccount1 (long account_no,String name,double balance)
	{
		this. account_no= account_no;
		this. name= name;
		this.balance= balance;
	}

	public String toString()
	{
		return "account_no : "+account_no;
	}

	public String toString()
	{
		return " balance : "+balance;
	}


	public String toString()
	{
		return " name: "+name ;
	}


	public static void main(String[] args) 
	{
		SavingsAccount1 a = new SavingsAccount1(1332500103315601l, "Rashmi N", 45000 );
		System.out.println(a);

	}
}
*/

