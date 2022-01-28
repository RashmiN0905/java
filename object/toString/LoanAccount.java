class LoanAccount
{
	private double loanAmount;

	public double getloanAmount()
	{
		return loanAmount;
	}

	public void setBalance(double loanAmount)
	{
	this.loanAmount=loanAmount;
	}
	LoanAccount()
	{
	
	}
	LoanAccount(double loanAmount)
	{
	super(9731994218632l, 6362629l);
	this.loanAmount=loanAmount;
	}
	public void displayAttributes()
	{
	System.out.println("loan Account balance is : "+loanAmount);
	}
	public String toString()
	{
		return "Loan Amount is : "+loanAmount;
	}

	public boolean equals (Object O)
	{
		LoanAccount l = (LoanAccount)O;
		if (this.loanAmount==loanAmount)
		return true;
		else
			return false;
	}

	public int hashCode()
	{
		int i = (int)loanAmount;
		return i;
	}
}

class SavingsAccount
{
	private double balance;

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
	this.balance=balance;
	}
	SavingsAccount()
	{

	}
	SavingsAccount(double balance)
	{
	super(1332500103315601l, 0000133l);
	this.balance=balance;
	}
	public void displayAttributes()
	{
	System.out.println("balance is : "+balance);
	}
	public String toString()
	{
		return "Savings Amount balance is : "+balance;
	}
	public boolean equals (Object O)
	{
		SavingsAccount s = (SavingsAccount)O;
		if (this.balance==balance)
		return true;
		else
			return false;
	}
	public int hashCode()
	{
		int i1 = (int)balance;
		return i1;
	}

}
class Account
{
	private long acc_no;
	private long isfc;

	public long getacc_no()
	{
		return acc_no;
	}

	public void setacc_no(long acc_no)
	{
	this.acc_no=acc_no;
	}
	public long getisfc()
	{
		return isfc;
	}

	public void setisfc(long isfc)
	{
	this.isfc=isfc;
	}
	Account()
	{
	}
	Account(long acc_no, long isfc)
	{
	this.acc_no=acc_no;
	this.isfc=isfc;
	}
	public void displayAttributes()
	{
	System.out.println("isfc is : "+isfc);
	System.out.println("acc_no is : "+acc_no);
	}
}






class Driver
{

	public static void main(String[] args) 
	{
		SavingsAccount S = new SavingsAccount(5000);
		SavingsAccount S1 = new SavingsAccount(6000);
		LoanAccount L1 = new LoanAccount(7000);
		LoanAccount L2 = new LoanAccount(7000);
	//	Account A = new Account(1332500103315601l, 0000133l);
      //  System.out.println(S.getacc_no());
		//System.out.println(L1.getacc_no());
		System.out.println(S.getBalance());
		System.out.println(L1.getloanAmount());
		System.out.println(L1==L2);
		System.out.println(L1.equals(L2));
	}
}
