import java.util.Scanner;
class Ball 
{
	private double radius;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius=radius;
	}

	Ball()
	{

	}

	Ball(double radius)
	{
		this.radius=radius;
	}

}

class BasketBall extends Ball
{
	String game= "Basket";
}

class TennisBall extends Ball
{
	String game= "tennis";
}

class Bag
{
	Ball b;

	Bag()
	{
	}
	public void addBasketBall(Ball b)
	{
		this.b=b;
		System.out.println(" Basket ball is added into bag");
	}
	public void addTennisBall(Ball b)
	{
		this.b=b;
		System.out.println("tennis ball is added into bag");
	}
	public void removeBall()
	{
		this.b=null;
		System.out.println("ball is removed from bag");
	}
	public void IsBagEmpty()
	{
	if (b==null)
	{
		System.out.println("bag is empty");
	}
	else
	
		System.out.println("bag is not Empty");
	}

	public void ShowGame()
	{
		if(b instanceof BasketBall)
		{
		BasketBall b1 = (BasketBall)b;
		  System.out.println("you can play with the "+b1.game+" now ");
	}
	else
		{
		TennisBall b1 = (TennisBall)b;
		  System.out.println("you can play with the "+b1.game+" now ");

	}
}
}

class UserInterface
{
	public static void main(String[]args)
	{	
		boolean flag= true;
		Scanner Sc= new Scanner(System.in);
		
		Bag b2 = new Bag();
		do{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Display the menu");
		System.out.println("=========================");
		System.out.println("1.Add ball  a.Basket ball  b.Tennis Ball");
		System.out.println("2.Remove ball");
		System.out.println("3.Check bag is empty or not");
		System.out.println("4.Show game that can be Displayed");
		System.out.println("5.Exit");
		System.out.println("******************");
		System.out.println("Enter your option");
		int option = Sc.nextInt();
		switch(option )
		{
			case 1:
			{
			System.out.println(" Enter option a for Basket ball ");
			System.out.println(" Enter option b for Tennis ball ");
			
			char ch = Sc.next().charAt(0);
			switch(ch)
			{
			case 'a' :
			{
		    b2.addBasketBall(new BasketBall());
			break;
			}

			
			case 'b' :
			{
			b2.addTennisBall(new TennisBall ());
			break;
			}
			default: System.out.println(" invalid choice ");
			}
			break;
			}
			case 2:	
			{
			b2.removeBall();
			break;
			}
			case 3:
			{   
			b2.IsBagEmpty();
			break;
			}
			case 4:
			{	
			b2.ShowGame();
			break;
			}
			case 5:
			{
			flag=false;
			break;
			}
			}
			}
			while(flag);
		
		}

	}


