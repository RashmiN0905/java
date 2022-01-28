import java.util.*;
class Channel 
{
	String name;
	double price;
	Channel()
	{
	}
	Channel(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
}
class Regional_pack 
{
	String name;
	double price;
	Regional_pack()
	{
	}
	Regional_pack(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
}

class Tatasky 
{
	Channel c;
	Regional_pack r;

	String name="Rashmi N";
	long contact_No= 9731994218l;
	String dateOfBirth="09-05-1998";
	String emailId="sumanagaraj7@gmail.com";
	int tataSky_id=456893;
	double balance=1021.00;
	
	Tatasky()
	{
	}
	
	Scanner Sc = new Scanner(System.in);
	HashSet<Channel> h1 = new HashSet<Channel>();
	HashSet<Regional_pack> h2 = new HashSet<Regional_pack>();

	public void modifyPack()
	{
		boolean flag = true;
	//	do
	//	{
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("Welcome to tata Sky");
	System.out.println("1.Add Channel");
	System.out.println("2.Add Regional Pack");
	System.out.println("3.Remove Channel");
	System.out.println("4.Remove Regional Pack");
//	System.out.println("5.Exit");
	System.out.println("============================");
	System.out.println("Enter your Choice");
	int choice = Sc.nextInt();
switch (choice)
{
case 1:
	{
	System.out.println("These are the available Channels");
	System.out.println("A.udaya Music");
	System.out.println("B.Colors Kannada ");

	System.out.println("which channel you want to add" +"\n"+ "Enter A to add udaya music " +"/n "+ "Enter B to add Colors Kannada  ");
	char opt = Sc.next().charAt(0);

	switch(opt)
		{
		case 'A':
			{
				h1.add(new Channel("Udaya Music ", 25.00));
				System.out.println("Udaya Music is added Succesfully");
				break;
			}

		case 'B':
			{
				h1.add(new Channel("Colors Kannada  ", 25.00));
				System.out.println("Colors Kannada is added Succesfully");
				break;
			}
		default:
			{
			System.out.println("Enter Valid option");
			}
		}
		break;
}
case 2:
	{
	System.out.println("These are the available Regional Packs");
	System.out.println("A.Musics");
	System.out.println("B.Hindi");

	System.out.println("which channel you want to add" +"/n "+ "Enter A to add Musics" +"/n "+ "Enter B to add Hindi ");
	char opt = Sc.next().charAt(0);

	switch(opt)
		{
		case 'A':
			{
				h2.add(new Regional_pack("Musics ", 355.00));
				System.out.println(" Musics is added Succesfully");
				break;
			}

		case 'B':
			{
				h2.add(new Regional_pack("Hindi", 400.00));
				System.out.println("Hindi is added Succesfully");
				break;
			}
		default:
			{
			System.out.println("Enter Valid option");
			}

		}
		break;
}

	case 3:
	{
	System.out.println("Enter the channel to be removed");
	String s1 = Sc.nextLine();
	Iterator i = h1.iterator();
	
	while(i.hasNext())
		{
		Channel c1=(Channel)i.next();
		if (s1.equals(c1.name))
		{
		i.remove();
		}
		System.out.println(s1+" channel is removed");
	}
	break;
	}
	case 4:
	{
	System.out.println("Enter the channel to be removed");
	String s2 = Sc.nextLine();
	Iterator i1 = h2.iterator();
	
	while(i1.hasNext())
		{
		Regional_pack c2 = (Regional_pack)i1.next();
		if (s2.equals(c2.name))
		{
			i1.remove();
		}
	System.out.println(s2+" channel is removed");
		}
	break;
	}
/*	case 5:
	{
		flag=false;
		break;
	}*/
	default:
	{
	System.out.println("Enter Valid option");
	}

	}
/*	}
	while (true);*/
}

public void MyAccount()
	{
	boolean flag= true;
	do{
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("1.Personal details");
	System.out.println("2.Modify Details");
		System.out.println("3, Exit");
	System.out.println("====================================================================");
	System.out.println("Enter your Choice");
	int choice = Sc.nextInt();
	switch (choice)
	{
	case 1:
	{

	System.out.println("Personal Details of the User");
	System.out.println("1. Name of the User "+name);
	System.out.println("2. Date of Birth of the user "+dateOfBirth);
	System.out.println(" 3.Contact Number of the User "+contact_No);
	System.out.println("4.Email Id of the User "+emailId);
	break;
	}
case 2:
	{

	System.out.println("A.Modify the User Name");
	System.out.println("B.Modify the Date of Birth of the User");
	System.out.println("C.Modify  the Contact Number of the User");
	System.out.println("D.Modify  the Email ID of  User");
    System.out.println("--------------------------------------------------------------------------");
	System.out.println("Enter your Option");
	char opt = Sc.next().charAt(0);
	switch(opt)
		{
		case 'A':
			{
				System.out.println("Enter The  name");
				String n=Sc.nextLine();
				n=Sc.nextLine();
				this.name=n;
				System.out.println("User name is Successfully modified as:"+name);
				break;
			}
		case 'B':
			{
				System.out.println("Enter The  DAte of Birth");
				String n=Sc.nextLine();
				n=Sc.nextLine();
				this.dateOfBirth=n;
				System.out.println("User Date of Birth is Successfully modified as:"+dateOfBirth);
				break;
			}

		case 'C':
			{
				System.out.println("Enter The  Contact Number");
				long n=Sc.nextLong();
				n=Sc.nextLong();
				this.contact_No=n;
				System.out.println("User Contact Number is Successfully modified as:"+contact_No);
				break;
			}
		case 'D':
			{
				System.out.println("Enter The  Email Id ");
				String n=Sc.nextLine();
				n=Sc.nextLine();
				this.emailId=n;
				System.out.println("User Email id is Successfully modified as:"+emailId);
				break;
			}

			default:
			{
				System.out.println("Enter Valid Option");
			}
		}
		break;
	}
	case 3:
		{
		flag=false;
		break;
		}

		default: 
		{
		System.out.println("Enter Valid Option");
		}
	}
}
while(true);
	}
public void recharge()
	{
System.out.println("---------------------------------------------------------------------------------------------------------------");
	double sum1=0;
	double sum2=0;
	for(Object o :h1)
		{
		Channel ch1 = (Channel)o;
		sum1= sum1+ch1.price;
		}	
	for(Object o :h2)
		{
		Regional_pack ch2 = (Regional_pack)o;
		sum2= sum2+ch2.price;
		}
	System.out.println(" amount to be paid for channel is "+sum1);
	System.out.println(" amount to be paid for Regional pack is "+sum2);
		double sum3=sum1+sum2;
	System.out.println("================================================================== ");
	System.out.println(" Total amount to be paid for Tata Sky is "+sum3);
	System.out.println("***************************************************************************");
	System.out.println(" Enter  the amount to be paid");
	double paid = Sc.nextDouble();
	System.out.println("Succesfully  paid "+paid+"RS");
	System.out.println("Balance is "+(sum3-paid)+"RS");
		System.out.println("Succesfully  paid "+paid+"RS");
	System.out.println("Thank you");
	System.out.println("***************************************************************************");

	}


	}

	class Driver
	{
	public static void main(String[]args)
		{
		Scanner Sc = new Scanner(System.in);
		Tatasky  tt = new Tatasky();
		boolean flag =true;

		do
		{
	System.out.println("1.modify pack");
	System.out.println("2.My account");
	System.out.println("3.Recharge");
	System.out.println("4.Exit");
	System.out.println("---------------------------------------------------------------------------------------------------------------");
    System.out.println("Enter your Option");
	int opt = Sc.nextInt();
	switch(opt)
		{
			case 1:
			{
				tt.modifyPack();
				break;
			}
			case 2:
			{
				tt.MyAccount();
				break;
			}

			case 3:
			{
				tt.recharge();
				break;
			}
			case 4:
			{
				flag=false;
				break;
			}
			default:
			{
				System.out.println("Enter Valid Option");
			}
		}
		}
		while(true);
	}
	}
