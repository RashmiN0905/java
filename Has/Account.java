
//AGGREGATION


class Account
{
	private String account_holder_name;
	private String accountName;
	private double balance;

	public String getAccount_holder_name()
	{
		return account_holder_name;
	}
	
	public void setAccount_holder_name(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}

	public String getAccountName()
	{
		return accountName;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	Account()
	{
	}
	Account(String account_holder_name, String accountName,double balance)
	{
	this.account_holder_name=account_holder_name;
	this.accountName=accountName;
	this.balance=balance;
	}

	public void accountDetails() 
	{
		System.out.println("Name of the Account Holder : "+account_holder_name);
		System.out.println("Name of the Account : "+accountName);
		System.out.println("Balance of the Account  : "+balance);
	}
}

class Branch
{
	Account a;
	private String manager_name;
	private long isfc;

	public String getManager_name()
	{
		return manager_name;
	}

	public void setManager_name(String manager_name)
	{
		this.manager_name=manager_name;
	}

	public long getIsfc()
	{
		return isfc;
	}

	Branch()
	{
	}
	Branch(String manager_name,long isfc)
	{
		this.manager_name=manager_name;
		this.isfc=isfc;
	}


	public void createAccount(Account a)
	{
		this.a=a;
		System.out.println("Account is created ");
	}

	public void branchAttributes()
	{
		System.out.println("Branch Manager name : "+manager_name);
		System.out.println("Branch ISFC : "+isfc);
	}

}

class User
{
	public static void main(String[]args)
	{
		Branch b = new Branch( "Vinay M S", 0000133l);
		
		
		b.createAccount(new Account(" Vismaya ", "Savings Bank", 10000l));
		b.branchAttributes();
		b.a.accountDetails();

}
}
