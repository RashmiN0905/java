import java.util.Scanner;
class Scenario 
{
	public static void main(String[] args) 
	{

	for(int num=2; num<10; num++)
		{
		demo(num);
		if(num==4 && num==5 && num==8 )
			{
			 break;
			}
			else
			{
			System.out.println(num+" card child should give "+demo(num)+" chocalates");	
			}
		}
	}

		public static int demo(int n )
		{
		int i;
		for( i=3; i<23; i++)
		{
			int count=2;
			for(int j=2;j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
				if(count==2)
			    {
					return i;
				}

				return i;
	         }
			 return i;
	}
	
}
