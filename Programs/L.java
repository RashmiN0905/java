class L
{
	public static void main(String[] args) 
	{
		int i=10;
		int evensum=0,oddsum=0;
	
		
		while(i<20)
		{
		    if(i%2==0)
			evensum=evensum+i;
			else 
            oddsum=oddsum+i;
			i++;
			
			}
			System.out.println("sum of even num "+evensum);
			System.out.println("sum of odd num "+oddsum);
	}

}

