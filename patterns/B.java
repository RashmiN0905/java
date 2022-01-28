class  B
{
	public static void main(String[] args) 
	{
		int row=4;
		int star=1;

		for(int i=0; i<row;i++)
		{
			for(int j=0; j<star;j++)
			{
			System.out.print("* ");
			}
				star++;
				System.out.println();
		}
	
		
	}
}

class  F
{
	public static void main(String[] args) 
	{
		int row=4;
		int star=4;

		for(int i=0; i<row;i++)
		{
			for(int j=0; j<star;j++)
			{
			System.out.print("* ");
			}
				star--;
				System.out.println();
		}	
		
	}
}

class  A
{
	public static void main(String[] args) 
	{
		int row=4;
		int space=3;
		int star=1;

		for(int i=0; i<row;i++)
		{
			for(int j=0; j<space;j++)
			{
			System.out.print(" ");
			}
			for(int k=0; k<star;k++)
			{
			System.out.print(" *");
			}
			space--;
		star++;
		System.out.println();
		}
		
	}
}


class  E
{
	public static void main(String[] args) 
	{
		int row=4;
		int space=3;
		int star=1;

		for(int i=0; i<row;i++)
		{
			for(int j=0; j<space;j++)
			{
			System.out.print(" ");
			}
			for(int k=0; k<star;k++)
			{
			System.out.print("*");
			}
			space--;
		star=star+2;
		System.out.println();
		}
		
	}
}


class  D
{
	public static void main(String[] args) 
	{
		int row=4;
		int star=4;

		for(int i=0; i<row;i++)
		{
			for(int j=0; j<star;j++)
			{
			System.out.print("* ");
			}
				star--;
				System.out.println();
		}
	
		
	}
}



