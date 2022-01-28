import java.util.*;
class Dish implements Comparable
{
	int id;
	double price;
	String name;
	String description;

	ArrayList a = new ArrayList();
	Dish()
	{
	}
	Dish(int id,double price, String name, String description)
	{
	this.id=id;
	this.price=price;
	this.name=name;
	this.description=description;
	}

	public void display()
	{
	System.out.println("Name of the Dish : "+name);
	System.out.println("Dish id is : "+id);
	System.out.println("Price of the Dish : "+price);
	System.out.println("Dish Description : "+description);
	}

	public int compareTo(Object o)
	{
		Dish h = (Dish)o;
		return (int)(this.price-h.price);
	}


}



class Bill
{
	Dish d;
	String dishes;
	int orderNo;
	String date;
	String time;

	Scanner Sc = new Scanner(System.in);
	Bill()
	{
	}

	Bill(String dishes,int orderNo,String date,String time)
	{
		this.dishes=dishes;
		this.orderNo=orderNo;
		this.date=date;
		this.time=time;
	}

	public void toSearch()
	{
		System.out.println("1.Dosa ");
		System.out.println("2.Poori ");
		System.out.println("3.Veg biriyani ");
		System.out.println("4.Meals");
		System.out.println("5.South indian meals");
	}


	ArrayList a1= new ArrayList();

	
	public void addDish()
	{
		boolean flag=true;
		do
		{
		System.out.println("1.Dosa ");
		System.out.println("2.Poori ");
		System.out.println("3.Veg biriyani ");
		System.out.println("4.Meals");
		System.out.println("5.South indian meals");
		System.out.println("6.Finish Ordering");
		System.out.println("======================================== ");
		System.out.println("Enter your Option to add the dishes");
		int opt = Sc.nextInt();
		switch(opt)
		{
			case 1:
			{
			a1.add(new Dish(100, 80.00, " Dosa ", "Masala dosa with potato stuff "));
			System.out.println("Dosa is added into cart ");
					System.out.println("======================================== ");
			break;
			}
			case 2:
			{
			a1.add(new Dish(101, 1350.00, " poori ", "poori with  chole masala "));	
			System.out.println("Poori is added into cart");
					System.out.println("======================================== ");
			break;
			}
			case 3:
			{
			a1.add(new Dish(102, 150.00, " Veg biriyani ", "Veg biriyani with  shezwani"));	
				System.out.println("Veg Biriyani is added into cart");
						System.out.println("======================================== ");
			break;
			}

			case 4:
			{
			a1.add(new Dish(103, 200.00, " Meals", "Rice sambar with Poori and Curry "));	
				System.out.println("Meals is added into cart");
						System.out.println("======================================== ");
			break;
			}
			case 5:
			{
			a1.add(new Dish(104, 120.00, " South indian meals ", "complete meals"));	
				System.out.println("South indian meals is added into cart");
						System.out.println("======================================== ");
			break;
			}
			case 6: 
			{
				flag=false;
			}
			default:
			{
			System.out.println("Enter Valid Option ");
			}
		}
		}
		while(true);
	}

	public double total()
	{
		double sum=0;
		for(Object o: a1)
		{
			Dish d = (Dish)o;
			sum=d.price;

		}
		return  sum;
	}

	public void toSortPrice()
	{
	ArrayList a2 = new ArrayList();

	Collections.sort(a2);
}


	public void removedish()
	{
		 System.out.println("enter the dish to be removed");
		 String str=s.next().trim();
		 Iterator i = dishes.iterator();
		 while(i.hasNext())
		{
			 Dish d=(Dish)i.next();
			 if( str.equals(d.getName()))
			{
				i.remove();
			}
		}
	}

public void generatebill()
	{ if(dishes==null)
	{
		return;
	}
		System.out.println("************************");
		System.out.println("Date       :   17-12-2021");
		System.out.println("Time       :       5:00PM");
		System.out.println("-------------------------");
		System.out.println("Dish                Price");
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			 System.out.println(d.getName()+"                     "+d.getPrice());
			  
		 }
		System.out.println("-------------------------");
		System.out.println("Total                  "+sum);
		System.out.println("SGST                     5%");
		System.out.println("CGST                     5%");
		System.out.println("Total                  "+(sum*1.1));
		System.out.println("Total amount to be paid is Rs "+(sum*1.1)+" only");
		System.out.println("************************");
		sum=0;
		System.out.println(sum);
	}

}

class Driver
{
	public static void main(String[] args) 
	{
		Bill b1 = new Bill();
		Scanner Sc = new Scanner(System.in);
		boolean flag=true;

		do
		{
			System.out.println("Welcome to hotel");
			System.out.println("==================");
			System.out.println("1.To search the food");
			System.out.println("2.To add the food");
			System.out.println("3.To remove the food");
			System.out.println("4.To sort by Price");
			System.out.println("5.calculate the Total");
			System.out.println("6. To Generate the bill");
			System.out.println("7.Exit");
			System.out.println("=======================");
			System.out.println("Enter your Option");
			int option = Sc.nextInt();

			switch(option)
			{
				case 1:
				{
					System.out.println("=======================");
					b1.toSearch();
					break;
				}

				case 2:
				{
				System.out.println("=======================");
				b1.addDish();
				break;
				}

				case 3: 
				{
					b1.remove();
					break;
				}
				case 4: 
				{
					b1.toSortPrice();
					break;
				}
				case 5 : 
				{
					b1.total();
					break;
				}
				case 6: 
				{
					b1.generatebill();
					break;
				}
				case 7: 
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
