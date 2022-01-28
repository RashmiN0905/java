class FibonacciSeries {

	public static void main(String[] args) {
		 int n=10;
		 int count=2;
		 int n1=0;
		 int n2=1;   
		 System.out.print(n1) ;
		 System.out.println(n2);
		    
		while(count<n)
		 {    
		  int  n3=n1+n2;    
		  System.out.print("   "+n3);    
		  n1=n2;    
		  n2=n3; 
		  count++;
		 }    
	     }  
		}
