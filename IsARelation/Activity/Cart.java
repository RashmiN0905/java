import java.util.Scanner;
class  Animal
{
	public Dog addDog()
	{
		System.out.println("Dog is added into cart");
		return new Dog();
	}
	public Cat addCat()
	{
		System.out.println("Cat is added into cart");
		return new Cat();
	}

}

class  Bird
{
	public Parrot addParrot()
	{
		System.out.println("Parrot is added into cart");
		return new Parrot();
	}
	public Pigeon addPigeon()
	{
		System.out.println("Pigeon is added into cart");
		return new Pigeon();
	}

}

class Dog extends Animal
{
	int price=30000;
	int age= 10;
	String colour= "Black";
}

class Cat extends Animal
{
	int price=20000;
	int age= 2;
	String colour= "white";
}
class Parrot extends Bird
{
	int price=5000;
	int age= 5;
}
class Pigeon extends Bird
{
	int price=2000;
	int age= 8;
}


class Cart
{
Animal A;
Bird B;
Scanner Sc = new Scanner(System.in);
public void addCart(Animal A)
	{
	this.A=A;
System.out.println("Enter a to add Dog");
System.out.println("Enter b to add Cat");
char ch = Sc.next().charAt(0);

switch(ch)
		{
	case 'a':
			{
		A.addDog();
		this.A=A.addDog();
			}
			break;
	case 'b':
			{
		A.addCat();
		this.A=A.addCat();
			}
			break;
	default:
			{
System.out.println("Enter valid option");
			}
		}
	}

public void addCart(Bird B)
	{
	this.B=B;
System.out.println("Enter a to add Parrot");
System.out.println("Enter b to add pigeon");
char ch = Sc.next().charAt(0);

switch(ch)
		{
	case 'a':
			{
		B.addParrot();
		this.B=B.addParrot();
			}
			break;
	case 'b':
			{
		B.addPigeon();
		this.B=B.addPigeon();
			}
			break;
	default:
			{
System.out.println("Enter valid option");
			}
		}
	}

public void isCartEmpty()
{
if(A==null && B==null)
	{
	System.out.println("CArt is Empty");
	}
else
	{
	System.out.println("CArt is not Empty");
	}
}

public void display()
	{
if (A!=null)
	{
		if(A instanceof Dog)
		{
			Dog d1=(Dog)A;
			System.out.println("Price of Dog is :"+ d1.price);
			System.out.println("age  of Dog is :"+ d1.age+"months");
			System.out.println("colour of Dog is :"+ d1.colour);

		}
		else
		{
			Cat d1=(Cat)A;
			System.out.println("Price of Cat is :"+ d1.price);
			System.out.println("age  of cat is :"+ d1.age+"months");
			System.out.println("colour of Cat is :"+ d1.colour);
		}
	}
	if(B!=null)
	{
		if (B instanceof Parrot)
		{
			Parrot d1=(Parrot)B;
			System.out.println("Price of Parrot is :"+ d1.price);
			System.out.println("age  of Parrot is :"+ d1.age+"months");
		}
		else  
		{
			Pigeon d1=(Pigeon)B;
			System.out.println("Price of Pigeon is :"+ d1.price);
			System.out.println("age  of Pigeon is :"+ d1.age+"months");
		}
	}
	else
		{
		System.out.println(" Nothing in Cart ");
			}
}

}
class Driver
	{
		public static void main(String[] args) 
	{
		boolean flag=true;
		Cart c = new Cart();
		Scanner Sc = new Scanner (System.in);
		do
		{
		System.out.println("********************");
		System.out.println("Welcome to shop");
		System.out.println("********************");
		System.out.println("1.Addcart  A.Animal B.Bird ");
		System.out.println("2.Check empty or not");
		System.out.println("3.display the items in cart");
		System.out.println("4.exit");
		System.out.println("===========================");

		System.out.println("Enter the option");
		int opt = Sc.nextInt();

		switch(opt)
			{
			case 1:
				{
				System.out.println("Enter A to add Animal");		
				System.out.println("Enter B to add Bird");
				System.out.println("Enter your option");
				
			   char ch = Sc.next().charAt(0);
						switch(ch)
						{
							case 'A':
							{
							c.addCart(new Animal());
							}
							break;
							case 'B':
							{
							c.addCart(new Bird());
							}
							break;
							default:
							{
								System.out.println("Enter valid option");
							}

						}
				}
				break;
				case 2: 
				{
					c.isCartEmpty();
				}
				break;
				case 3:
				{
					c.display();
				}
				break;
				case 4: 
				{
					flag=false;
				}
				break;
				default:
				{
				System.out.println("Enter valid option");
				}
			}
			
	}
	while(true);

	}
	}





