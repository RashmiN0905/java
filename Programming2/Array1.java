class  Array1
{
	public static void main(String[] args) 
	{
		int[]a={3,2,8,6,7};

		for(int i=0; i<a.length;i++)
		{
			int temp=0;
		for(int j=i; j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

		}

		}
		for(int i=0; i<a.length;i++)
		{
		System.out.println(a[i]);
		}

	}
}


class  Array2
{
	public static void main(String[] args) 
	{
		int[]a={3,2,8,6,7};

		for(int i=0; i<a.length;i++)
		{
			int temp=0;
		for(int j=i; j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

		}

		}
		for(int i=0; i<a.length;i++)
		{
		System.out.println(a[i]);
		}

	}
}

