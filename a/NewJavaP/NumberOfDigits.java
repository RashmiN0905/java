class NumberOfDigits 
{
	public static void main(String[] args) 
	{
		int num=123;
		int number=num;
		int countOfNumbers=0;
		while(num>0)
		{
			int num1=num%10;
			countOfNumbers++;
			num=num/10;
		}
		System.out.println(countOfNumbers+" is the count of digits of number "+number);
	}
}
