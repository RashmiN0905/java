class Account
{
	private String account_holder_name;
	private long account_number;
	private double balance;
	

	public String getAccount_holder_name()
	{
		return account_holder_name;
	}

	public void SetAccount_holder_name(String Account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}

	public long getAccount_number()
	{
		return account_number;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double Balance)
	{
		this.balance=balance;
	}

	Account ()
	{
	}

	Account(String account_holder_name)
	{
		this.account_holder_name = account_holder_name;
	}

	Account (String account_holder_name, long account_number)
	{
		this(account_holder_name);
		this.account_number=account_number;
	}

	Account (String account_holder_name, long account_number,double balance)
	{
		this(account_holder_name, account_number);
		this. balance= balance;
	}
	public void accountDetails()
	{
		System.out.println("Account holder name : "+account_holder_name);
		System.out.println("Account Number : "+account_number);
		System.out.println("Account Balance : "+balance);
	}

	public static void main (String[]args)
	{
		Account a = new Account("RASHMI", 123456789555l, 1446.25);
		a.accountDetails();
		
	
}
}
