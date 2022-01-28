 class Exception1{

	public static void main(String[] args)   {
		
		int actualpin=1234;
		int enteredpin=1230;
		
		try{
			if(actualpin==enteredpin)
				System.out.println("trascation-succesfully");
			else
			throw new MyException("not valid pin");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
		
		
	}

}
 public class MyException extends Exception{
		   String str1;
		  
		   MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
