import java.util.Scanner;
class ATM
{

private String Account_holder_name;
private long Account_num;
private int password;
private double balance;

public double add_balance(double balance)
	{
	if(balance%100==0 || balance%200==0 ||balance%500==0 ||balance%2000==0)
		{
		this.balance = this.balance+balance;
		}

		else
		{
	     System.out.println("add balance only in terms of 100 or 200 or 500 or 2000");
		}

		return balance;
	}

	public void withdraw(double amount)
	{
		

			if(amount< balance)
			{
			balance= balance-amount;
			System.out.println(" Succesfully Withdrawn");
			}
			else
			{
			System.out.println("Invalid Password");
			}
			
		
		
	}
	public double getBalance()
	{
		return balance;
	}

		ATM()
		{
		}

		ATM(String Account_holder_name, long Account_num,int password,double balance)
		{
			this.Account_holder_name=Account_holder_name;
			this.Account_num=Account_num;
			this.password=password;
			this.balance= balance;
		}

	
}

class Driver
{
  static int password=1234;
	public static void main(String[] args) 
	{
		ATM a= new ATM("Rashmi N", 1332500103315601l, 1234, 25000);
		boolean flag= true;
		do
		{
		System.out.println("=======================");
		System.out.println(" Welcome to ATM");
		System.out.println("1.Add Amount");
		System.out.println("2.withdraw amount");
		System.out.println("3.check  Balance");
		System.out.println("4.Exit");
		System.out.println("=======================");
		System.out.println(" Enter the option");
		Scanner Sc= new Scanner(System.in);
		int opt = Sc.nextInt();

		switch (opt)
		{
		case 1:
			{
			System.out.println("Enter the balanace");
			double bal = Sc.nextDouble();
			System.out.println(a.add_balance(bal)+" is the Balance");
			//System.out.println(a.add_balance(bal));

			}
			break;

		case 2:
			{
			
		System.out.println("Enter the password");
		int passwordd= Sc.nextInt();
		    if(password== passwordd)
		{
			System.out.println("Enter the ba;lance");
			double bal= Sc.nextDouble();


			a.withdraw(bal);
			}
			else
		{
				System.out.println("Enter valid Amount");
		}
			}
			break;

		case 3:
			{
			System.out.println(a.getBalance());
			}
			break;

		case 4:
			{
			flag=false;
			}
			break;
		
		default: 
			{
			System.out.println("Enter the valid option");
			}

		}
		}
		while(true);
					
}
}
