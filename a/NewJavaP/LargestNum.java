class LargestNum 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=5;
		int num3=15;

		int largest1= (num1>num2? num1:num2);
		int largest2= (num2>num3? num2:num3);

		int largest=(largest1> largest2? largest1: largest2);
		System.out.println(largest+": is the largest number ");
	}
}
