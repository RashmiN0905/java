class B
{
	public static void Main (String[] args)
	{
		
		int n=5;
		char ch= 'A';
	
		for(int i=0; i<n; i++)
		{
			
			for(int j=0; j<n; j++)
			{
				if(i>=j)
				{
					System.out.print(ch);
					ch++;
				}
				else 
				{
				System.out.print(" ");
				}
				
			}
		}


	}
}
