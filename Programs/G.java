class G
{
	public static void main(String[] args) 
	{
		int a=7;
		int b=5;
		int c=13;
		int d= a<b?a:b;
		int e= b<c?b:c;


		System.out.println(d<e? d:e);
		int f= d<e ? d:e;
		System.out.println("smallest among these three is " +f);
	}
}
