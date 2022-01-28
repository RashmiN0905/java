import java.util.Scanner;
 abstract class Ball
{
	private int radius;
	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius=radius;
	}
	abstract public void showGame();
}


class BasketBall extends Ball
{
	String game="BasketBall";

 public void  showGame()
{
System.out.println("we can play Basketball game");

}
}

class TennisBall extends Ball
{
	String game="TennisBall";
 public void  showGame()
{
System.out.println("we can play tennis game");

}
}



class Bag
{
	Ball ball;
	
		void addBall(Ball ball)

	{		this.ball=ball;
			
			System.out.println("Ball is added");
		
	}

	void removeBall()
	{
		ball=null;
		System.out.println("Ball is removed");


	}
	 
	void isBagEmpty()
	{
		if(ball == null)
		{
			System.out.println("Bag is Emply");
		}
		else
		{
			System.out.println("Bag is not Emply");
		}

	}	

	void showGame()
	{
 ball.showGame();
		
		}
}

class Driver1
{
	public static void main(String[] args) 
	{	
		Scanner s= new Scanner(System.in);
		
		Bag b = new Bag();
		boolean flag=true;
		do{

		System.out.println("**************");
		System.out.println("Welcome Select Option");
		System.out.println("1. Add Ball");
		System.out.println("2. Remove ball");
		System.out.println("3. Check Bag is empty or not");
		System.out.println("4. Show game that can be played");
		System.out.println("5. Exit");
		System.out.println("**************");
		System.out.println("Enter your option");
		
		
		int opt=s.nextInt();
		switch(opt)
		{	
			
			case 1: System.out.println("1.Basket ball 2.Tennis ball");
			{	
				int s1= s.nextInt();
				switch (s1)
				{
				case 1:
					{
					b.addBall(new BasketBall());
					break;
					}
				case 2: 
					{
					b.addBall(new TennisBall());
					break;
					}
				}
				break;
				
			}
			case 2: {
						b.removeBall();
						break;
		         	}
			case 3: {
						b.isBagEmpty();
						break;
					}
			case 4: {
						b.showGame();
						break;
			        }
						
			case 5: flag=false;
		}
		}while(flag);

	}
}