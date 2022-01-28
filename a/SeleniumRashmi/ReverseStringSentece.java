import java.util.Scanner;

 class ReverseStringSentece {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentense");
		String[] s1=sc.nextLine().split("");

		String rev = ""; 
	      for (int i = s1.length - 1; i >= 0; i--) { 
	        rev =rev+ s1[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + rev); 
	    }
		
	}
