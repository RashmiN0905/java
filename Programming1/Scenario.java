import java.util.Scanner;
class Scenario 
{
	public static void main(String[] args) 
	{

		for(int i=3; i<23; i++)
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
					int num=2;
					while(num>1 && num<9)
					{
						if(num==4 && num==5 && num==8 )
						{
						break;
						}
						else
						
							System.out.println(num+" card child should give "+i+" chocalates");	
						num++;
							
					}				
		}

	}
	}
	}
		