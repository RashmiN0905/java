class SumOfEvenAndOdd 
{
	public static void main(String[] args) 
	{
		int Esum=0;
		int Osum=0;
		for(int i=20; i>0; i--)
		{
			if(i%2==0)
			{
			Esum=Esum+i;
			}
			else
			{
			Osum=Osum+i;
			}
			}
			System.out.println(Esum);
			System.out.println(Osum);
	}
}
